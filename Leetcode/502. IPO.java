class Project{
    int profit;
    int capital;
    Project(int profit, int capital) {
        this.profit = profit;
        this.capital = capital;
    }
}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        Queue<Project> minHeap = new PriorityQueue<>((a,b) -> (a.capital - b.capital));
        Queue<Project> maxHeap = new PriorityQueue<>((a,b) -> (b.profit - a.profit));
        int n = profits.length;
        int final_w = w;

        for(int i=0;i<n;i++) minHeap.add(new Project(profits[i], capital[i]));

        while(k-- > 0){
            while(!minHeap.isEmpty() && minHeap.peek().capital <= w)
                maxHeap.add(minHeap.poll());
            if(maxHeap.isEmpty()) break;
            w += maxHeap.poll().profit;
        }

        return w;
    }
}
