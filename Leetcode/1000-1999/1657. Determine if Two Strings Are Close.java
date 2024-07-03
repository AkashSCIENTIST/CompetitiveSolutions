class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;

        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        boolean[] barr1 = new boolean[128];
        boolean[] barr2 = new boolean[128];

        for(char c : word1.toCharArray()){
            arr1[c]++; barr1[c] = true;
        } 
        for(char c : word2.toCharArray()){
            arr2[c]++; barr2[c] = true;
        } 
        if(!Arrays.equals(barr1, barr2)) return false;


        Arrays.sort(arr1); Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
