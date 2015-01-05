package Expressions.NonTerminalExpressions;

import Context.CriminalRecord;
import Expressions.CriminalExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aram on 1/5/2015.
 */
public abstract class NonTerminalExpression implements CriminalExpression {
    protected List<CriminalExpression> expressions;

    public NonTerminalExpression() {
        expressions = new ArrayList<CriminalExpression>();
    }

    public NonTerminalExpression(List<CriminalExpression> expressions) {
        this.expressions = expressions;
    }

    public void AddExpression(CriminalExpression expression) {
        expressions.add(expression);
    }

    public void RemoveExpression(CriminalExpression expression) {
        expressions.remove(expression);
    }

    @Override
    public abstract boolean Interpret(CriminalRecord record);
}
