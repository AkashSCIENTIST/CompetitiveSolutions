import java.util.*;

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n = hand.length;
        if(n%groupSize != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Arrays.sort(hand);

        for(int card : hand){
            if(map.get(card) == 0) continue;
            for(int i=0;i<groupSize;i++){
                int count = map.getOrDefault(card+i, 0);
                if(count == 0) return false;
                else map.put(card+i, count-1);
            }
        }

        return true;
    }
}
