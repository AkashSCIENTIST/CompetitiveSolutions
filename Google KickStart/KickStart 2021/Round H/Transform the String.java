import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution{
    public static int min(int a, int b){
        if(a <= b) return a;
        else return b;
    }
	public static void main(String[] args){
		String master1 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		String master2 = "zyxwvutsrqponmlkjihgfedcbazyxwvutsrqponmlkjihgfedcba";
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int case_ = 1; case_ <= n; case_++){
		    int res = 0;
		    String s = sc.next();
		    String f = sc.next();
		    for(String j: s.split("")){
		        int temp = 26;
		        if(temp == 0) continue;
		        for(String k : f.split("")){
		            if(k.equals(j)){
		                temp = 0;
		                break;
		            }
		            int n1 = master1.substring(master1.indexOf(j)).indexOf(k);
		            int n2 = master2.substring(master2.indexOf(j)).indexOf(k);
		            int n3 = min(n1, n2);
		            temp = min(n3, temp);
		        }
		       res +=  temp;
		    }
		    System.out.println("Case #" + case_ + ": " + res);
		}
	}
}
