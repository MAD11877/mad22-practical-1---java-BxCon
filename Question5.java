import java.util.Scanner;
import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
    int US = in.nextInt();
    Map<String, Integer> map = new HashMap<String, Integer>();

    for (int i = 0; i <= US; i++){
      String US2 = in.nextLine();
      
      Integer V = map.get(US2);
      map.put(US2, V == null ? 1 : V + 1);
      
    }

    Map.Entry<String, Integer> mx = null;

    for (Map.Entry<String, Integer> e : map.entrySet()){
      if(mx == null || e.getValue() > mx.getValue()){
        mx = e;
      }
    }

    System.out.println(mx.getKey());
    
  }
}
