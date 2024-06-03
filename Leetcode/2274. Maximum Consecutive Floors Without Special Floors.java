class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int n = special.length;
        int range_count = 0;

        for(int i=-1;i<n;i++){
            if(i == -1){
                if(bottom < special[0]){
                    range_count = Math.max(range_count, special[0] - bottom);
                }
                // System.out.println(bottom + " " + special[0] + " " + range_count);
            }
            else if(i == n-1){
                if(special[n-1] < top){
                    range_count = Math.max(range_count, top - special[n-1]);
                }
                // System.out.println(special[i] + " " + top + " " + range_count);
            }
            else{
                if(special[i+1]-special[i] > 1){
                    range_count = Math.max(range_count, special[i+1] - special[i] - 1);
                }
                // System.out.println(special[i] + " " + special[i+1] + " " + range_count);
            }
        }

        return range_count;
    }
}
