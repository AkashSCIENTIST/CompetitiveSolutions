class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        else if(n == 1) return x;
        else if(n < 0){
            if(n%2 == 0){
                n = n/2;
                n = -n;
                x = 1/(x*x);
            }
            else{
                n = -n;
                x = 1/x;
            }
        }
        if(n%2 == 0) return myPow(x*x, n/2);
        else return  x * myPow(x*x, n/2);
        
    }
}
