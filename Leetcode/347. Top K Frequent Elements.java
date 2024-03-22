import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0)+1);
        PriorityQueue<Map.Entry<Integer, Integer>> q = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            q.add(entry);
            if(q.size() > k) q.poll();
        }

        while(!q.isEmpty()){
            arr[--k] = q.poll().getKey();
        }

        return arr;
    }
}
