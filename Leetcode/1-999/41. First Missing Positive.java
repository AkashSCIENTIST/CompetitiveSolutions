import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        for(int i : nums) set.add(i);
        Integer new_nums[] = set.toArray(new Integer[0]);
        int num = 1;
        for(int i : new_nums){
            if(i <= 0) continue;
            if(i == num){
                num++;
            }
            else{
                return num;
            }
        };
        return num;
    }
}
