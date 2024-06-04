class Solution {
    public int compareVersion(String version1, String version2) {
        int v1[] = stringToArray(version1);
        int v2[] = stringToArray(version2);
        int n1 = v1.length, n2 = v2.length;
        int n = Math.max(n1, n2);
        int temp1, temp2;

        for(int i=0;i<n;i++){
            temp1 = (i < n1) ? v1[i] : 0;
            temp2 = (i < n2) ? v2[i] : 0;
            if(temp1 < temp2) return -1;
            if(temp1 > temp2) return 1;
        }

        return 0;

    }
    public int[] stringToArray(String version){
        String nums[] = version.split("\\.");
        // System.out.println(Arrays.toString(nums));
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) ans[i] = Integer.parseInt(nums[i]);
        return ans;
    }
}
