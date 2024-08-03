class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n1 = target.length;
        int n2 = arr.length;
        if(n1 != n2) return false;
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<n1;i++) if(target[i] != arr[i]) return false;
        return true;
    }
}
