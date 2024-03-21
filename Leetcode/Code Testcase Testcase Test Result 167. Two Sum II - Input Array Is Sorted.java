class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        int arr[] = new int[2];
        int sum;

        while(start < end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                arr[0] = start+1;
                arr[1] = end+1;
                break;
            }
            else if(sum < target) start++;
            else end--;
        }

        return arr;
    }
}
