package Expressions.NonTerminalExpressions;

import Context.CriminalRecord;
import Expressions.CriminalExpression;

import java.util.List;

/**
 * Created by Aram on 1/5/2015.
 */
public class AlternationExpression extends NonTerminalExpression {
    public AlternationExpression() {
        super();
    }

    public AlternationExpression(List<CriminalExpression> criminalExpressions) {
        super(criminalExpressions);
    }

    @Override
    public boolean Interpret(CriminalRecord record) {
        for(CriminalExpression expression : expressions) {
            if(expression.Interpret(record)) {
                return true;
            }
        }
        return false;
    }
}
