package Expressions.NonTerminalExpressions;

import Context.CriminalRecord;
import Expressions.CriminalExpression;

import javax.sound.midi.Sequence;
import java.util.List;

/**
 * Created by Aram on 1/5/2015.
 */
public class SequenceExpression extends NonTerminalExpression {
    public SequenceExpression() {
        super();
    }

    public SequenceExpression(List<CriminalExpression> criminalExpressions) {
        super(criminalExpressions);
    }

    @Override
    public boolean Interpret(CriminalRecord record) {
        for(CriminalExpression expression : expressions) {
            if(!expression.Interpret(record)) {
                return false;
            }
        }
        return true;
    }
}
