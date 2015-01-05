package Expressions.TerminalExpressions;

import Context.Crime;
import Context.CriminalRecord;
import Expressions.CriminalExpression;

import java.util.List;

/**
 * Created by Aram on 1/5/2015.
 */
public class CrimeExpression implements CriminalExpression {
    private Crime crime;

    public CrimeExpression(Crime crime) {
        this.crime = crime;
    }

    @Override
    public boolean Interpret(CriminalRecord record) {
        List<Crime> crimes = record.getCrimes();

        return crimes.contains(crime);
    }
}
