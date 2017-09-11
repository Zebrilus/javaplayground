package javaplayground;


/**
 * @author ulrich.luebke
 *
 */
public class FizzBuzz {

    private int end;

    /**
     * 
     */
    public FizzBuzz(int upTo) {
        this.end = upTo;
    }
    
    void run() {
        run(1);
    }
        
    void run(final int current) {
        if (current %15 == 0) {
            System.out.println("Fizzbuzz");
        } else if (current % 3 == 0) {
            System.out.print("Fizz");
        } else if (current % 5 == 0) {
            System.out.print("Buzz");
         } else {
             System.out.print(current);
         }
        if (current < end) {
            System.out.print(", ");
            run (current +1);
        }         
    }
    
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz(100);
        fizzBuzz.run();        
    }

}
