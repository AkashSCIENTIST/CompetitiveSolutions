class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp;
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        // System.out.println(Arrays.deepToString(intervals));
        
        list.add(new ArrayList<>(){
            {
                add(intervals[0][0]); 
                add(intervals[0][1]);
            }
        });

        for(int i=1;i<n;i++) {
            final int a = intervals[i][0];
            final int b = intervals[i][1];

            final int c = list.get(list.size()-1).get(1);

            if(c < a) 
                list.add(new ArrayList<>(){
                    {add(a); add(b);}
                });
            else list.get(list.size()-1).set(1, Math.max(b, c));

            // System.out.println(list);
        }

        int n1 = list.size();
        int[][] newArray = new int[n1][2];

        for(int i=0;i<n1;i++) {
            newArray[i][0] = list.get(i).get(0);
            newArray[i][1] = list.get(i).get(1);
        }
        return newArray;
    }
}
