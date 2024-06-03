class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0, size = 0;

        for(int i : nums){
            if(i == 0) size++;
            else if(i != 0){
                if(size > 0){
                    long temp = fibo(size);
                    // System.out.println(size + " " + temp);
                    total += temp;
                }
                size = 0;
            }
        }

        if(size != 0){
            long temp = fibo(size);
            // System.out.println(size + " " + temp);
            total += temp;
        }

        return total;
    }

    public long fibo(long n){
        return n*(n+1)/2;
    }
}
