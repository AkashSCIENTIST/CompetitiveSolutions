class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;

        for(int i=0;i<n;i++){
            sum += nums[i];
            if(k != 0) sum %= k;
            if(map.containsKey(sum)){
                if(i - map.get(sum) >= 2) return true;
            }
            else{
                map.put(sum, i);
            }
        }

        return false;
    }
}
