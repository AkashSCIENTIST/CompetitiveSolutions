class Solution {
    public int minimumSum(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return (10*(arr[0]-'0') + (arr[2]-'0')) + (10*(arr[1]-'0') + (arr[3]-'0'));
    }
}
