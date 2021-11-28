import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String arr[][] = new String[][]{{"01", "2"}, {"12","3"}, {"23", "4"}, {"34","5"}, {"45","6"}, {"56", "7"}, {"67","8"}, {"78", "9"}, {"89","0"}, {"90", "1"}};
		Pattern pattern = Pattern.compile("(01)|(12)|(23)|(34)|(45)|(56)|(67)|(78)|(89)|(90)");
		
		for(int case_ = 1; case_ <= n; case_++){
		    int t = sc.nextInt();
		    String s = sc.next();
		    while(true){
                boolean matchFound = pattern.matcher(s).find();
                if(matchFound){
                    for(String i[] : arr){
		                s = s.replaceAll(i[0], i[1]);
		            }
                }
                else{
                    break;
                }
		    }
		    System.out.println("Case #" + case_ + ": " + s);
		}
	}
}
