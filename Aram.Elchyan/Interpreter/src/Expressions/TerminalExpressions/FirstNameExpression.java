package Expressions.TerminalExpressions;

import Context.CriminalRecord;
import Expressions.CriminalExpression;

/**
 * Created by Aram on 1/5/2015.
 */
public class FirstNameExpression implements CriminalExpression {
    private String name;

    public FirstNameExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean Interpret(CriminalRecord record) {
        return record.getFirstName() == name;
    }
}
