class Solution {
    public int nthUglyNumber(int n) {
        ArrayList<Integer> list = new ArrayList();
        int i2 = 0, i3 = 0, i5 = 0;
        int next2, next3, next5, next;
        list.add(1);

        while(list.size() < n) {
            next2 = list.get(i2)*2;
            next3 = list.get(i3)*3;
            next5 = list.get(i5)*5;
            next = Math.min(next2, Math.min(next3, next5));
            list.add(next);
            if(next == next2) i2++;
            if(next == next3) i3++;
            if(next == next5) i5++;
        }

        return list.get(n-1);
    }
}
