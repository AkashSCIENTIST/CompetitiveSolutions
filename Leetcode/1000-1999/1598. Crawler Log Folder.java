class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for(String log : logs) {
            if(log.equals("./")) continue;
            else if(log.equals("../")) count--;
            else count++;
            count = count>=0?count:0;
        }

        return count;
    }
}
