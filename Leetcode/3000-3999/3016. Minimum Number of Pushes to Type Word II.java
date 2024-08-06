class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int arr[] = new int[26];
        for(char c : word.toCharArray()) arr[c-'a']++;
        Arrays.sort(arr);

        for(int i=0;i<26;i++) ans += arr[26-i-1]* (i/8 + 1);

        return ans;
    }
}
