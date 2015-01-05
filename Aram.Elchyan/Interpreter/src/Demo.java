import Context.Crime;
import Context.CriminalRecord;
import Expressions.CriminalExpression;
import Expressions.NonTerminalExpressions.AlternationExpression;
import Expressions.NonTerminalExpressions.SequenceExpression;
import Expressions.TerminalExpressions.CrimeExpression;
import Expressions.TerminalExpressions.FirstNameExpression;
import Expressions.TerminalExpressions.LastNameExpression;
import Expressions.TerminalExpressions.MinimalYearsInJailExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        List<CriminalRecord> criminalRecords = GetCriminalRecords();

        CriminalExpression expression = GetCriminalExpression();

        List<CriminalRecord> recordsMatchingToExpression = FindMatchingRecords(criminalRecords, expression);
    }

    public static List<CriminalRecord> FindMatchingRecords(List<CriminalRecord> records, CriminalExpression expression) {
        List<CriminalRecord> matchingRecords = new ArrayList<CriminalRecord>();

        for(CriminalRecord record : records) {
            if(expression.Interpret(record)) {
                matchingRecords.add(record);
            }
        }

        return matchingRecords;
    }


    public static CriminalExpression GetCriminalExpression() {
        FirstNameExpression fNameExp = new FirstNameExpression("Walter");

        AlternationExpression alternationExpr1 = new AlternationExpression(Arrays.asList(new CriminalExpression[]{
                new LastNameExpression("White"),
                new LastNameExpression("Smith"),
                new LastNameExpression("Ryan")
        }));

        AlternationExpression alternationExpr2 = new AlternationExpression(Arrays.asList(new CriminalExpression[]{
                new CrimeExpression(Crime.DrugDealing),
                new CrimeExpression(Crime.Robbery)
        }));

        MinimalYearsInJailExpression yearsInJailExpression = new MinimalYearsInJailExpression(8);


        SequenceExpression expression = new SequenceExpression(Arrays.asList(new CriminalExpression[]{
                fNameExp,
                alternationExpr1,
                alternationExpr2,
                yearsInJailExpression
        }));

        return  expression;
    }

    private static List<CriminalRecord> GetCriminalRecords() {
        List<CriminalRecord> records = new ArrayList<CriminalRecord>();

        CriminalRecord recordTemp;

        recordTemp = new CriminalRecord("Walter", "White");
        recordTemp.addCrime(Crime.DrugDealing);
        recordTemp.addCrime(Crime.Murder);
        recordTemp.setYearsSpentInJail(18);
        records.add(recordTemp);

        recordTemp = new CriminalRecord("Jesse", "Pinkman");
        recordTemp.addCrime(Crime.DrugDealing);
        recordTemp.addCrime(Crime.Murder);
        recordTemp.addCrime(Crime.Robbery);
        recordTemp.setYearsSpentInJail(10);
        records.add(recordTemp);

        recordTemp = new CriminalRecord("Gregor", "Clegane");
        recordTemp.addCrime(Crime.Murder);
        recordTemp.addCrime(Crime.Robbery);
        recordTemp.setYearsSpentInJail(2);
        records.add(recordTemp);

        recordTemp = new CriminalRecord("Randall", "Raines");
        recordTemp.addCrime(Crime.Robbery);
        recordTemp.setYearsSpentInJail(5);
        records.add(recordTemp);

        recordTemp = new CriminalRecord("Walter", "Smith");
        recordTemp.addCrime(Crime.Robbery);
        recordTemp.setYearsSpentInJail(1);
        records.add(recordTemp);

        return records;
    }
}
