class Solution {
    public String clearDigits(String s) {
        if(s.equals("")) return s;
        char[] arr = s.toCharArray();
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            if(arr[i]!='\0' && Character.isDigit(arr[i])) process(arr, i, n);
        }
        
        StringBuilder sb = new StringBuilder();
        for(char c : arr){
            if(c == '\0') continue;
            sb.append(c);
        }
        return sb.toString();
    }
    public void process(char[] arr, int idx, int n){
        int i = 1;
        int left;
        while(true){
            left = idx-i;
            while((arr[left] == '\0') && (left>-1)) left--;
            if(left >= 0 && Character.isLetter(arr[left])){
                arr[left] = '\0';
                arr[idx] = '\0';
                break;
            }
            i++;
        }
    }
}
