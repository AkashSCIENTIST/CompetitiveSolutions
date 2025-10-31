class Solution {
    public long maxAlternatingSum(int[] nums) {
        Queue<Integer> q = new PriorityQueue<>((a, b) -> Integer.compare(b * b, a * a));
        int n = nums.length;
        for(int i=0;i<n;i++) q.offer(nums[i]);
        Queue<Integer> high = new LinkedList<>();
        Queue<Integer> low = new LinkedList<>();

        int half = (n+1)/2;
        for(int i=0;i<half;i++) high.offer(q.poll());
        while(!q.isEmpty()) low.offer(q.poll());

        long res = 0;
        while(!high.isEmpty()) {
            res += Math.pow(high.poll().intValue(), 2);
            if(!low.isEmpty()) res -= Math.pow(low.poll().intValue(), 2);
        }
        
        return res;
    }
}
