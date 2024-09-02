class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i : chalk) sum += i;
        k %= sum;
        if(k == 0) return 0;

        for(int i=0;i<chalk.length;i++) {
            k-= chalk[i];
            if(k < 0) return i;
        }

        return 0;
    }
}
