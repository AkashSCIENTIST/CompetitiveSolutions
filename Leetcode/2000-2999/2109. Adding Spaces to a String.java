class Solution {
    public String addSpaces(String s, int[] spaces) {
      
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int idx = spaces.length-1;
        
        for(int i=n-1;i>=0;i--) {
            sb.append(s.charAt(i));
            if(i == spaces[idx]) {
                sb.append(' ');
                if(idx != 0) idx--;
            }
        }

        return sb.reverse().toString();
    }
}
