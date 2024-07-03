class ATM {

    long count[];
    int denomination[];
    long value;

    public ATM() {
        denomination = new int[]{20, 50, 100, 200, 500};
        count = new long[]{0, 0, 0, 0, 0};
        value = 0;
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i=0;i<5;i++){
            value += denomination[i]*banknotesCount[i];
            count[i] += banknotesCount[i];
        }
    }
    
    public int[] withdraw(int amount) {
        if(amount > value) return new int[]{-1};
        int temp[] = new int[]{0,0,0,0,0};
        long cur = 0;

        for(int i=4;i>=0;i--){
            cur = amount / denomination[i];
            if(cur <= count[i]){
                temp[i] = (int)cur;
            }
            else{
                cur = count[i];
                temp[i] = (int)count[i];
            }
            amount -= (cur * denomination[i]);
        }

        if(amount > 0) return new int[]{-1};
        cur = 0;
        for(int i=0;i<5;i++) cur += temp[i]*denomination[i];
        for(int i=0;i<5;i++) count[i] -= temp[i];
        value -= cur;
        return temp;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */
