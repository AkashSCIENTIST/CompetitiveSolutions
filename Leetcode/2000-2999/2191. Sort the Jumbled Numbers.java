class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        ArrayList<int[]> q = new ArrayList<int[]>(nums.length);
        for(int i=0;i<nums.length;i++) {
            q.add(new int[]{
                convert(mapping, nums[i]),
                i,
                nums[i],
            });
        }
        Collections.sort(q, (a,b) -> (a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]));
        int arr[] = new int[nums.length];
        int i=0;
        Iterator<int[]> itr = q.iterator();
        while(itr.hasNext()) arr[i++] = itr.next()[2];
        return arr;
    }

    public int convert(int[] mapping, int num){
        int temp = 0;
        for(char c : String.valueOf(num).toCharArray()){
            temp *= 10;
            temp += mapping[c-'0'];
        }
        return temp;
    }
}
