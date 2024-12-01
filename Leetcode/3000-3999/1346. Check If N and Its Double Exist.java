class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean[] exist = new boolean[2*1000+1];

        for(int i : arr) {
            int a = i;
            int b = 2*a;
            int c = a/2;

            // System.out.println(a + " " + b + " " + c);

            if(i == 0) {
                if(exist[1000]) return true;
                exist[1000] = true;
                continue;
            }

            exist[a+1000] = true;

            if(b < 1001 && b > -1001) {
                if(exist[b+1000]) return true;
            } 

            if(a%2==0) {
                if(exist[c+1000]) return true;
            }
        }

        return false;
    }
}
