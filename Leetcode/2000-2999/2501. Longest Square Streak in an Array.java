class Solution {
    public int longestSquareStreak(int[] nums) {
        // HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = -1;
        int n = nums.length;

        // for(int i:nums) set.add(i);
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        
        for(int i=n-1;i>=0;i--) {
            map.put(nums[i], map.getOrDefault(nums[i]*nums[i], 0) + 1);
            count = Math.max(map.get(nums[i]), count);
        }

        if(count == 1) count = -1;

        return count;
    }


} 
