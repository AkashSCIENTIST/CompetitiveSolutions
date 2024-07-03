class Solution {
    public List<Integer> circularPermutation(int n, int start) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<(1<<n);i++) arr.add(start ^ i ^ (i>>1));
        return arr;
    }
}
