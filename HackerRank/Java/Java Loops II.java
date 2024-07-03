import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int temp = a;
            int power = 0;
            
            for(int j=0; j<n; j++){
                temp += Math.pow(2,power++)*b;
                System.out.printf("%d ",temp);
            }
            System.out.println();
        }
        in.close();
    }
}
