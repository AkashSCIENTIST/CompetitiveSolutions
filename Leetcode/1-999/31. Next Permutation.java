class Solution {
    public void nextPermutation(int[] nums) {
        int ind = -1; //peak element's index
        int n = nums.length;

        for(int i=n-2;i>=0;i--) {
            if(nums[i] < nums[i+1]) {
                ind = i;
                break;
            }
        }

        if(ind == -1) {
            reverseArray(nums, 0, n-1);
            return;
        }

        for(int i=n-1;i>ind;i--) {
            if(nums[ind] < nums[i]){
                int temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        reverseArray(nums, ind+1, n-1);
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
