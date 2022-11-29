class Solution {
    public boolean checkValidString(String s) {
           char arr[] = s.toCharArray();
           int minV = 0, maxV = 0;
           for(char c : arr){
               if(c == '('){
                   minV++;
                   maxV++;
               }
               else if(c == ')'){
                   minV--;
                   maxV--;
               }
               else{
                   minV--;
                   maxV++;
               }
               if(maxV < 0) return false;
               if(minV < 0) minV = 0;
           }
           return minV==0;
    }
}
