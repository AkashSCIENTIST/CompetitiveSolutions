class Solution {
    public int[] closestDivisors(int num) {
        int n1 = num+1;
        int n2 = num+2;
        for(int i=(int)Math.sqrt(num+2);i!=0;i--){
            if(n1%i == 0) return new int[]{i, n1/i};
            if(n2%i == 0) return new int[]{i, n2/i};
        }
        return new int[]{num, 1};
    }
}
