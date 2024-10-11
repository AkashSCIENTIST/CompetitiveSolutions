import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.lang.*;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		// Write your code here.
		PriorityQueue<List<Integer>> q = new PriorityQueue<>(
			(a, b) -> Integer.compare(a.get(0), b.get(0))
		);
		ArrayList<Integer> list = new ArrayList<>();

		for (ArrayList<Integer> arr : kArrays) {
            if (!arr.isEmpty()) {
                q.add(arr);
            }
        }

		while(!q.isEmpty()){
            List<Integer> temp = q.poll();
            if(temp.size() != 0) list.add(temp.get(0));
			if(temp.size() != 0) temp.remove(0);
            if(temp.size() != 0) q.add(temp);
        }

		return list;
	}
}
