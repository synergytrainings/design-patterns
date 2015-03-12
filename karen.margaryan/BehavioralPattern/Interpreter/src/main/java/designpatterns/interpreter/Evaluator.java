package designpatterns.interpreter;

import java.util.Currency;
import java.util.Map;

/**
 * Created by Karen on 3/12/2015.
 */
public class Evaluator implements IExpression {

    @Override
    public String interpret(Context context) {
        String expression = context.getExpression();

        CurrencyNameExpression currencyNameExpression = new CurrencyNameExpression();
        ToExpression toExpression = new ToExpression();
        NumberExpression numberExpression = new NumberExpression();

        String translatedExpression = "";
        for (String token : expression.split(" ")) {
            switch (token) {
                case "USD":
                case "GBP":
                    currencyNameExpression.setCurrencyName(token);
                    translatedExpression += currencyNameExpression.interpret(context);
                    break;

                case "TO":
                    translatedExpression += toExpression.interpret(context);
                    break;

                default:
                    numberExpression.setNumber(token);
                    translatedExpression += numberExpression.interpret(context);
            }
        }

        return translatedExpression;
    }
}
