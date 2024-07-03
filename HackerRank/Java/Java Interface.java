

//Write your code here
class MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int s = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                s += i;
            }
        }
        return s;
    }
}

