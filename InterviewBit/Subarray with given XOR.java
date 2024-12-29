public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int x = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i=0;i<n;i++) {
            x ^= A.get(i);
            int k = x ^ B;
            
            if(map.containsKey(k)) count += map.get(k);
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        return count;
    }
}
