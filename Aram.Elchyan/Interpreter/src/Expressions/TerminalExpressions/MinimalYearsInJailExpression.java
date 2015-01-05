package Expressions.TerminalExpressions;

import Context.CriminalRecord;
import Expressions.CriminalExpression;

/**
 * Created by Aram on 1/5/2015.
 */
public class MinimalYearsInJailExpression implements CriminalExpression {
    private int years;

    public MinimalYearsInJailExpression(int years) {
        this.years = years;
    }

    @Override
    public boolean Interpret(CriminalRecord record) {
        return record.getYearsSpentInJail() >= years;
    }
}
