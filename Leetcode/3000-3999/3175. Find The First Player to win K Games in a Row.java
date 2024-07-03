class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        Deque<Integer> q = new LinkedList<>();
        int n = skills.length;
        
        for(int i=1;i<n;i++){
            q.addLast(i);
        }

        int ele = 0, streak = 0;

        while(true){
            int num = q.pollFirst();
            if(skills[num] < skills[ele]){
                streak++;
                q.addLast(num);
            }
            else{
                streak = 1;
                q.addLast(ele);
                ele = num;
            }
            if((streak==k) || (streak >= n-1)) return ele;
        }
    }
}
