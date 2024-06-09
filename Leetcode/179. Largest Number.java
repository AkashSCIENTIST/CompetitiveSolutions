class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i=0;i<nums.length;i++) strs[i] = String.valueOf(nums[i]);
        Arrays.sort(strs, new StringComparator());
        StringBuilder sb = new StringBuilder();
        for(String s : strs) sb.append(s);
        String s = sb.toString();
        return s.startsWith("00") ? "0" : s;
    }
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(final String a, final String b){
        String x = a+b;
        String y = b+a;
        return y.compareTo(x);
    }
}
