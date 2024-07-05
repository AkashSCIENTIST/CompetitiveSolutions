class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int prevIndex = -1;
        int firstIndex = -1;
        int index = 1;
        ListNode curr = head.next;
        ListNode prev = head;
        int minDis = Integer.MAX_VALUE;

        while(curr.next != null) {
            if(
                (prev.val > curr.val && curr.val < curr.next.val) ||
                (prev.val < curr.val && curr.val > curr.next.val)
            ) {
                if(firstIndex == -1) firstIndex = index;
                if(prevIndex != -1) minDis = Math.min(minDis, index - prevIndex);
                prevIndex = index;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }

        if(minDis == Integer.MAX_VALUE) return new int[]{-1, -1};
        return new int[]{minDis, prevIndex - firstIndex};
    }
}
