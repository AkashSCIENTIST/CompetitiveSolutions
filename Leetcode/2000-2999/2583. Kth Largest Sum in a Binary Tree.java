class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> oq = new PriorityQueue<>(
            Collections.reverseOrder());
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            long sum = 0;
            for(int i=0;i<size;i++) {
                TreeNode temp = q.poll();
                sum += temp.val;
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            oq.offer(sum);
        }
        
        if(oq.size() < k) return -1;
        while(k-->1) oq.poll();
        return oq.poll();
    }
}
