/******************************************************************************
 *  Compilation: 
 *  Execution: 
 ******************************************************************************/

import edu.princeton.cs.algs4.Counter;

public class Counting {

    public static void main(String[] args) { 

        Counter counter = new Counter("counter");
        counter.increment();
        counter.increment();
        counter.increment();
        System.out.println(counter.toString());
    }
}

