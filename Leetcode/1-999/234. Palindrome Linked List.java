class Solution {
    public boolean isPalindrome(ListNode head) {

        int[] arr = new int[100000];
        int n = 0;
        ListNode ptr = head;

        while(ptr != null) {
            arr[n++] = ptr.val;
            ptr = ptr.next;
        }

        int m = n/2;

        for(int i=0;i<m;i++) {
            if(arr[i] != arr[n-i-1]) return false;
        }
        return true;
    }
}
