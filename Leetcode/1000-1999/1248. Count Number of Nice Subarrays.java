class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int oddCount[] = new int[n+1];
        oddCount[0] = 1;
        int result = 0;
        int currOddCount = 0;

        for(int num : nums) {
            currOddCount += num&1;
            // System.out.println(num + " " + result + " " + Arrays.toString(oddCount));
            if(currOddCount >= k) result += oddCount[currOddCount - k];
            oddCount[currOddCount]++;
        }

        return result;
    }
}
