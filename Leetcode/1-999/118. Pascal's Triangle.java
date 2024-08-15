class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        
        list.add(List.of(1));
        for(int i=2;i<=numRows;i++){
            List<Integer> lastRow = list.get(i-2);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);
            int n = lastRow.size();
            for(int k=0;k<n-1;k++) 
                currRow.add(lastRow.get(k) + lastRow.get(k+1));
            currRow.add(1);

            list.add(currRow);
        }

        return list;
    }
}
