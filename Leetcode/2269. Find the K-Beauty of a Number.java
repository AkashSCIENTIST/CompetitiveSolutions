class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = ""+num;
        int ans = 0;
        int n = str.length();
        for(int i=k;i<=n;i++){
            int temp = Integer.valueOf(str.substring(i-k, i));
            // System.out.println(temp);
            if(temp == 0) continue;
            if(num%temp == 0) ans++;
        }
        return ans;
    }
}
