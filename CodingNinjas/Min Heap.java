import java.util.* ;
import java.io.*; 

public class Solution {

// minHeap function which take size of Queries and Queries as Input.
// Returns an array out outputs depending on the query.
    static int[] minHeap(int n, int[][] q) {
        int size[] = new int[]{-1};
        int ans[] = new int[1];
        List<Integer> list = new ArrayList<>();
        List<Integer> heap = new ArrayList<>();

        for(int ins[] : q) {

            if(ins[0] == 0)  {
                insertHeap(heap, ins[1]);
            }
            else if(ins[0] == 1) {
                int min = deleteMin(heap);
                list.add(min);
            }
            // System.out.println(heap);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    static void insertHeap(List<Integer> heap, int el) {
        heap.add(el);
        int idx = heap.size()-1;
        int parent = (idx-1)/2;
        while(idx>=0 && (heap.get(parent) > heap.get(idx))) {
            swap(heap, idx, parent);
            idx = parent;
            parent = (idx-1)/2;
        }
    }

    static int deleteMin(List<Integer> heap) {
        // System.out.print(heap[0] + " ");
        int min = heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        // System.out.println("Before percolate " + heap);
        percolate(heap, 0);
        return min;
    }

    static void swap(List<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static void percolate(List<Integer> arr, int idx) {

        int left = 2*idx+1;
        int right = 2*idx+2;
        int smaller = idx;

        if(left<arr.size() && (arr.get(left)<arr.get(smaller))) smaller = left;
        if(right<arr.size() && (arr.get(right)<arr.get(smaller))) smaller = right;

        if(idx != smaller){
            swap(arr, idx, smaller);
            percolate(arr, smaller);
        }


    }
}
