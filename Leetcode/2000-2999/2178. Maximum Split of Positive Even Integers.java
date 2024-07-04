class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<>();
        if(finalSum%2 == 1) return list;
        long even = 2;

        while(finalSum-even >= even+2){
            list.add(even);
            finalSum -= even;
            even += 2;
        }
        list.add(finalSum);

        return list;
    }
}
