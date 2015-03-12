package designpatterns.interpreter;

/**
 * Created by Karen on 3/12/2015.
 */
public class CurrencyNameExpression implements IExpression{

    private String currencyName;

    public CurrencyNameExpression() {
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    @Override
    public String interpret(Context context) {
        return context.getMappings().get(currencyName);
    }
}
