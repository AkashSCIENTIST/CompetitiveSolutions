class Solution {
public:
    int climbStairs(int n) {
        if(n<=3) return n;
        int a = 1, b = 1, temp;
        for(int i=0;i<n-1;i++){
            temp = a+b;
            a = b;
            b = temp;
        }
        return temp;
    }
};
