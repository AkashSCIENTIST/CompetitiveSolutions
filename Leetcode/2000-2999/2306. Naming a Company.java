class Solution {
    public long distinctNames(String[] ideas) {
        HashSet<String>[] suffix = new HashSet[26];
        for(int i=0;i<26;i++) suffix[i] = new HashSet<>();
        for(String i: ideas){
            suffix[i.charAt(0)-'a'].add(i.substring(1));
        }
        HashSet<String> tempSet;
        long count = 0;
        for(int i=0;i<25;i++){
            for(int j=i+1;j<26;j++){
                tempSet = new HashSet<>(suffix[i]);
                tempSet.retainAll(suffix[j]);
                int tempCount = tempSet.size();
                count += 2 * (suffix[i].size() - tempCount) * (suffix[j].size() - tempCount);
            }
        }
        return count;
    }
}
