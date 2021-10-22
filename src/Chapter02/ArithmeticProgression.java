package Chapter02;

public class ArithmeticProgression extends Progression{
    protected long increment;

    /** Constructs progression 0, 1, 2, ... */
    public ArithmeticProgression() { this(1, 0); }

    /** Constructs progression 0, stepSize, 2*stepSize, ... */
    public ArithmeticProgression(long stepSize) { this(stepSize, 0); }

    /** Constructs arithmetic progression with arbitrary start and increment. */
    public ArithmeticProgression(long stepSize, long start){
        super(start);
        increment = stepSize;
    }

    /** Adds the arithmetic increment to the current value. */
    protected void advance(){
        current += increment;
    }
}
