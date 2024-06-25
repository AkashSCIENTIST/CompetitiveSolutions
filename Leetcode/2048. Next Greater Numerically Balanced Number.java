class Solution {
    public int nextBeautifulNumber(int n) {
        while(!isBalanced(++n));
        return n;
    }

    public boolean isBalanced(int n){
        int[] arr = new int[10];
        int temp;
        while(n > 0){
            temp = n%10;
            if(temp == 0) return false;
            arr[temp]++;
            n /= 10;
        }
        for(int i=0;i<10;i++){
            if(arr[i]>0 && arr[i] != i) return false;
        }
        return true;
    }
}
