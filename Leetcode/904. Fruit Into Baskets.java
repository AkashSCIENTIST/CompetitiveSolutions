class Solution {
    public int totalFruit(int[] fruits) {
        int ans = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int l=0,r=0; r<fruits.length;r++){
            count.put(fruits[r], count.getOrDefault(fruits[r], 0) + 1);
            while(count.size() > 2){
                count.put(fruits[l], count.get(fruits[l])-1);
                count.remove(fruits[l], 0);
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}
