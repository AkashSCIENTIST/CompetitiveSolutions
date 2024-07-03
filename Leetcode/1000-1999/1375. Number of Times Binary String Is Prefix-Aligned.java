class Solution {
    public int arr[];
    public int n;
    public boolean isPrefixAlign(int idx){
        for(int i=0;i<=idx;i++){
            if(arr[i] == 0) return false;
        }
        for(int i=idx+1;i<n;i++){
            if(arr[i] == 1) return false;
        }
        return true;
    }
    public int numTimesAllBlue(int[] flips) {
        n = flips.length;
        arr = new int[flips.length];
        int count = 0;
        int counter = 0;
        for(int i : flips){
            arr[i-1] = 1;
            if(isPrefixAlign(counter++)) count++;
        }
        return count;
    }
}
