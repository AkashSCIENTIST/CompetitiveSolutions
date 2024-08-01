class Solution {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder("1");
        while(--n > 0){
            String s = sb.toString();
            sb.setLength(0);
            char c = s.charAt(0);
            int count = 1;
            for(int i=1;i<s.length();i++){
                if(s.charAt(i) == c) count++;
                else{
                    sb.append(""+count);
                    sb.append(c);
                    count  = 1;
                    c = s.charAt(i);
                }
            }
            sb.append(""+count);
            sb.append(c);
        }
        return sb.toString();
    }
}
