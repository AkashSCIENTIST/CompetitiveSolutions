class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int element1 = Integer.MIN_VALUE;
        int element2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for(int i : nums) {
            if(count1 == 0 && element2 != i) {
                count1 = 1;
                element1 = i;
            }
            else if(count2 == 0 && element1 != i) {
                count2 = 1;
                element2 = i;
            }
            else if(i == element1) count1++;
            else if(i == element2) count2++;
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        List<Integer> list = new ArrayList<>();
        int req = (int)(nums.length/3)+1;

        for(int i : nums) {
            if(element1 == i) count1++;
            else if(element2 == i) count2++;
        }


        if(count1>=req) list.add(element1);
        if(count2>=req) list.add(element2);

        return list;
    }
}
