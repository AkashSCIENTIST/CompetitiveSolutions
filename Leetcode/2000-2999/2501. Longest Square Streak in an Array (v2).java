class Solution {
    public int longestSquareStreak(int[] nums) {
        int max = 100000;
        boolean[] doesExist = new boolean[max+1];
        boolean[] isVisited = new boolean[max+1];
        int count = -1;

        for(int i : nums) doesExist[i] = true;

        for(int i=2;i*i<=max;i++) {
            if(!doesExist[i] || isVisited[i]) continue;
            int length = 0;
            int j = i;
            while(true) {
                isVisited[j] = true;
                length++;
                j=j*j;
                
                if(j < 0) break;
                if(j>max) break;
                if(!doesExist[j]) break;
            }
            count = Math.max(count, length);
            if(count <= 1) count = -1;
        }

        return count;
    }

} 
