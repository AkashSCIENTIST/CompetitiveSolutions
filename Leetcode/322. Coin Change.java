class Solution {
    HashMap<Integer,Integer> map;
    Solution(){
        map = new HashMap<Integer,Integer>();
    }

    public int coinChange(int[] coins, int amount) {
        if(amount == 0) return 0;
        if(amount < 0) return -1;
        if(map.containsKey(amount)) return map.get(amount);

        int num = Integer.MAX_VALUE;
        int temp;
        for(int coin : coins){
            if(coin <= amount){
                temp = coinChange(coins, amount-coin)+1;
                if(temp > 0) num = Math.min(num, temp);
            }
        }
        if(map.containsKey(amount)){
            map.put(amount, Math.min(map.get(amount), num));
        }
        else{
            map.put(amount, num);
        }
        if(map.get(amount) != Integer.MAX_VALUE) return map.get(amount);
        else return -1;
    }
}
