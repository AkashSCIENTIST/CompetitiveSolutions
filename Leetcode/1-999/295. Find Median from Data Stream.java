class MedianFinder {
    List<Integer> arr;
    public MedianFinder() {
        arr = new ArrayList<Integer>();
    }
    
    public void addNum(int num) {
        if(arr.size() == 0) arr.add(0, num);  
        else{
            int i=0;
            while(arr.get(i) <= num && i<arr.size()-1) i++;
            if(arr.get(i) <= num) arr.add(i+1, num);
            else arr.add(i, num);
        }
    }
    
    public double findMedian() {
        int n = arr.size();
        if((n&1) == 1) return (double)arr.get(n/2);
        else return (double)(arr.get((n-1)/2) + arr.get(n/2))/2;
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
