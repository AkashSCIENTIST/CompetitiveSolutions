class Freq{
    int val, freq;
    Freq(int val, int freq) {
        this.val = val;
        this.freq = freq;
    }
}

class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[nums.length];
        Freq temp;

        for(int i : nums) map.merge(i, 1, (a,b)->a+b);
        PriorityQueue<Freq> q = new PriorityQueue<>(
            (a,b) -> b.freq==a.freq ? b.val-a.val : a.freq-b.freq
        );

        for(Map.Entry<Integer, Integer> freq : map.entrySet()) 
            q.add(new Freq(freq.getKey(), freq.getValue()));

        Iterator itr = q.iterator();
        
        int i = 0;
        while(itr.hasNext()) {
            temp = q.poll();
            for(int j=0;j<temp.freq;j++) res[i++] = temp.val;
        }
        return res;
    }
}
