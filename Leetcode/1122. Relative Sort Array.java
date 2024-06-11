class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int count[] = new int[1001];
        for(int i : arr1) count[i]++;
        int index = 0;

        for(int i : arr2){
            while(count[i]-- > 0) {
                arr1[index++] = i;
            }
        }

        for(int i=0;i<=1000;i++){
            while(count[i]-- > 0){
                arr1[index++] = i;
            }
        }


        // Approach : 
        // Elements occuring in arr2 must be appered in arr1 as per same order they occur in arr2.
        // Eg. if 2 is first number of arr2, then all 2's in arr1 must appear first in arr1
        // Use TreeMap for better understanding

        // for(int i : arr2) {
        //     while(count[i] > 0){
        //         arr1[index] = i
        //         index++;
        //         count[i]--;
        //     }
        // }

        // for(int i=0;i<=1000;i++){
        //     while(count[i] > 0){
        //         arr1[index] = i;
        //         index++;
        //         count[i]--;
        //     }
        // }

        return arr1;
    }
}
