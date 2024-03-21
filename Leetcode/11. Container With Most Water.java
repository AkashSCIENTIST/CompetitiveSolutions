import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int min_height = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            min_height = Math.min(height[left], height[right]);
            max = Math.max(max, min_height * (right - left));
            if(height[left] < height[right]) left++;
            else right--;
        }

        return max;
    }
}
