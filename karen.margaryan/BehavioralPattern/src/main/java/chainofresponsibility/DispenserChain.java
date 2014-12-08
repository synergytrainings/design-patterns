package chainofresponsibility;

/**
 * Created by Karen on 12/9/2014.
 */
abstract public class DispenserChain {
    private DispenserChain nextDispenser;

    public void setNextDispenser(DispenserChain nextDispenser) {
        this.nextDispenser = nextDispenser;
    };

    public DispenserChain getNextDispenser() {
        return nextDispenser;
    }

    abstract public void handler();
}
