class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int ans = 0;

        for(int i=1;i<n-1;i++){
            int leftSmall = 0;
            int leftBig = 0;
            int rightSmall = 0;
            int rightBig = 0;

            for(int j=0;j<i;j++){
                if(rating[j] < rating[i]) leftSmall++;
                if(rating[j] > rating[i]) leftBig++;
            }

            for(int j=i+1;j<n;j++){
                if(rating[i] < rating[j]) rightBig++;
                if(rating[i] > rating[j]) rightSmall++;
            }

            ans += (leftSmall*rightBig) + (leftBig*rightSmall);
        }

        return ans;
    }
}
