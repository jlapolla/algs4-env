/******************************************************************************
 *  Compilation: 
 *  Execution: 
 ******************************************************************************/

public class BadFindBugs {

    public static void somethingBad(int number) {

      int[] blah = new int[3];
      blah[number] = 5;

      if ((number & 0) == 0) {

        System.out.println("It must be my lucky day!");
      }
    }

    public static void main(String[] args) { 

        somethingBad(5);
        System.out.println("Bad FindBugs!");
    }
}

