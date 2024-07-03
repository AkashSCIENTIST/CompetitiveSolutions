class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean i1 = false, i2 = false, i3 = false;
        for(int[] t : triplets){
            if((t[0] > target[0]) || (t[1] > target[1]) || (t[2] > target[2])) continue;
            else{
                if(t[0] == target[0]) i1 = true;
                if(t[1] == target[1]) i2 = true;
                if(t[2] == target[2]) i3 = true;
            }
        }

        return (i1 == true) && (i2 == true) && (i3 == true);
    }
}
