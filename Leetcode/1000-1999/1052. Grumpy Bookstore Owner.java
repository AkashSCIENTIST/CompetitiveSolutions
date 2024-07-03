class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int total = 0;
        int totalGrumpy = 0;
        int tempGrumpy = 0;
        int maxGrumpy = 0;

        for(int i=0;i<grumpy.length;i++){
            total += customers[i];
            if(grumpy[i] == 1){
                totalGrumpy += customers[i];
                tempGrumpy += customers[i];

            }

            if(i >= minutes){
                if(grumpy[i-minutes] == 1) {
                    tempGrumpy -= customers[i-minutes];
                }
            }

            maxGrumpy = Math.max(maxGrumpy, tempGrumpy);
        }

        return total - totalGrumpy + maxGrumpy;
    }
}
