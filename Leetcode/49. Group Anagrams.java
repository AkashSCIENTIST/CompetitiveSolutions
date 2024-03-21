import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        String key;
        for(String s : strs){
            char[] sarr = s.toCharArray();
            Arrays.sort(sarr);
            key = String.valueOf(sarr);
            if(!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
