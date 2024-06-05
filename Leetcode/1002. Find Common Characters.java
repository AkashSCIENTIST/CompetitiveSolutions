class Solution {
    public List<String> commonChars(String[] words) {
        int count[] = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
        int n;
        List<String> ans = new ArrayList<>();

        for(String s : words){
            int temp[] = new int[26];
            n = s.length();
            for(int i=0;i<n;i++) temp[s.charAt(i)-'a']++;
            for(int i=0;i<26;i++) count[i] = Math.min(temp[i], count[i]);
        }

        for(int i=0;i<26;i++){
            for(int j=count[i];j>0;j--) ans.add(String.valueOf((char)('a'+i)));
        }

        return ans;
    }
}
