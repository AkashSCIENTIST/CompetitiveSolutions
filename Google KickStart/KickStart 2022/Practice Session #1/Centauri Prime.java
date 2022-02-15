import java.util.*;
import java.lang.*;

public class Solution {

  private static String getRuler(String kingdom) {
    String ruler = "";
    char l = kingdom.charAt(kingdom.length() - 1);
    Character c1 = new Character(l);
    Character c2 = new Character('y');
    
    if(c1.equals(c2)){
        ruler = "nobody";
    }
    else if("AEIOUaeiou".contains("" + l)){
        ruler = "Alice";
    }
    else{
        ruler = "Bob";
    }
    
    return ruler;
  }

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      int T = in.nextInt();
      for (int t = 1; t <= T; ++t) {
        String kingdom = in.next();
        System.out.println(
            "Case #" + t + ": " + kingdom + " is ruled by " + getRuler(kingdom) + ".");
      }
    }
  }
}
