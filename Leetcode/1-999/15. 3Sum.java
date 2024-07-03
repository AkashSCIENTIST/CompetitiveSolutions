import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int left, right, sum;
        
        for(int i=0;i<n-2;i++){
            left = i+1;
            right = n-1;
            while(left < right){
                sum = nums[left]+nums[i]+nums[right];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[left]);
                    temp.add(nums[i]);
                    temp.add(nums[right]);
                    list.add(temp);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(sum < 0) left++;
                else right--;
            }
        }
        return List.copyOf(list);
    }
}
