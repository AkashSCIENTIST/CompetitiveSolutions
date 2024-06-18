class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n_work = difficulty.length;
        int n_worker = worker.length;
        int[][] arr = new int[n_work][2];

        for(int i=0;i<n_work;i++) arr[i] = new int[]{difficulty[i], profit[i]};
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(worker);
        // System.out.println(Arrays.deepToString(arr));

        int i=0;
        int ans=0, maxProfit=0;

        for(int w : worker){
            while(i<n_worker && w>=arr[i][0]){
                maxProfit = Math.max(maxProfit, arr[i][1]);
                i++;
            }
            ans += maxProfit;
        }
        
        return ans;
    }
}
