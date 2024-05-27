import java.util.*;

class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            map.put(s.charAt(i), i);
        }

        int i=0, j=0, count=0;
        List<Integer> list = new LinkedList();

        while(i < n){
            count = 0;
            j = Math.max(j, map.get(s.charAt(i)));
            while(i <= j){
                j = Math.max(j, map.get(s.charAt(i)));
                i++;
                count++;
            }
            list.add(count);
        }

        return list;
    }
}
