package designpatterns.interpreter;

/**
 * Created by Karen on 3/12/2015.
 */
public class NumberExpression implements IExpression {

    private String number;

    public NumberExpression() {}

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String interpret(Context context) {
        return number + " * ";
    }
}
