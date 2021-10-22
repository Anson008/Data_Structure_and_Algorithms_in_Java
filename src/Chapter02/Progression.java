package Chapter02;

public class Progression {
    // instance variable
    protected long current;

    /** Constructs a progression starting at zero.*/
    public Progression() { this(0); }

    /** Constructs a progression with a given start value. */
    public Progression(long start) { current = start; }

    /** Returns the next value of the progression. */
    public long nextValue(){
        long res = current;
        advance();
        return res;
    }

    /** Advances the current value to the next value of the progression. */
    protected void advance(){
        current++;
    }

    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n){
        System.out.print(nextValue());
        for (int i = 1; i < n; i++)
            System.out.print(" " + nextValue());
        System.out.println();
    }

    // main method

}
