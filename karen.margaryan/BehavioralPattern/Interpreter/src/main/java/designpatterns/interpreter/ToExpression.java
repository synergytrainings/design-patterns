package designpatterns.interpreter;

/**
 * Created by Karen on 3/12/2015.
 */
public class ToExpression implements IExpression {

    public ToExpression() {
    }

    @Override
    public String interpret(Context context) {
        return " / ";
    }
}
