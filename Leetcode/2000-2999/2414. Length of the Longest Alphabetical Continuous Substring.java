class Solution {
    public int longestContinuousSubstring(String s) {
        char[] chars = s.toCharArray();
        int count = 1;
        int maxCount = count;
        for(int i=1;i<chars.length;i++){
            // System.out.println(chars[i] + " " + count);
            if(chars[i] == chars[i-1]+1) count++;
            else{
                maxCount = Math.max(count, maxCount);
                count = 1;
            }
        }
        maxCount = Math.max(count, maxCount);
        return maxCount;
    }
}
