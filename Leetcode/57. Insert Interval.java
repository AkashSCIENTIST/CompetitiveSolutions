class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        for(int[] interval : intervals) {
            if(newInterval==null || interval[1]<newInterval[0]) list.add(interval);
            else if(interval[0]>newInterval[1]) {
                list.add(newInterval);
                list.add(interval);
                newInterval = null;
            }
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        if(newInterval != null) list.add(newInterval);
        return list.toArray(new int[list.size()][]);
    }
}
