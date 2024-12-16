class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Pair<Integer, Integer>> q = new PriorityQueue<>(
            (a,b) -> a.getKey().equals(b.getKey()) 
            ? a.getValue().compareTo(b.getValue())
            : a.getKey().compareTo(b.getKey())
        );
        int n = nums.length;

        for(int i=0;i<n;i++) q.offer(new Pair(nums[i], i));

        while(k-->0) {
            int num = q.peek().getKey();
            int i = q.poll().getValue();
            q.offer(new Pair(multiplier * num, i));
        }

        while(!q.isEmpty()) {
            int num = q.peek().getKey();
            int i = q.poll().getValue();
            nums[i] = num;
        }

        return nums;
    }
}
