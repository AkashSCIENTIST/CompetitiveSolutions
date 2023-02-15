class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int overflow = 0, temp;
        for(int i=num.length-1;i>=0;i--){
            temp = num[i] + (k%10) + overflow;
            list.add(temp%10);
            overflow = temp / 10;
            k /= 10;
        }
        while((overflow > 0) || (k>0)){
            temp = (overflow%10) + (k%10);
            list.add(temp%10);
            overflow = temp / 10;
            k /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
