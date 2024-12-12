class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        if(n == 0) return new LinkedList<>();
        List<String> ans = new ArrayList<>();
        int num1 = nums[0];
        int num2 = nums[0];

        for(int i=1;i<n;i++) {
            if(num2+1 == nums[i]) num2 = nums[i];
            else {
                if(num1 != num2) ans.add(num1 + "->" + num2);
                else ans.add(num1+"");
                num1 = nums[i];
                num2 = nums[i];
            }
        }

        if(num1 != num2) ans.add(num1 + "->" + num2);
        else ans.add(""+num1);

        return ans;
    }
}
