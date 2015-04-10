package com.synisys.training.patterns.behavioral.observer;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Anania.Mikaelyan
 * @since 4/6/2015
 */
public class YearlyBreakdowns implements Observer {
    List<YearlyBreakdown> data = new ArrayList<>(5);

    @Override
    public void update(Observable o, Object arg) {
        //cast is unpreventable if using java.util observer
        if (!(o instanceof StartEndDateDuration)) {
            throw new IllegalArgumentException("Commitments subscribe to StartEndDuration only");
        }
        StartEndDateDuration duration = (StartEndDateDuration) o;
        Iterator<YearlyBreakdown> iterator = data.iterator();
        while (iterator.hasNext()) {
            YearlyBreakdown yearlyBreakdown = iterator.next();
            if (yearlyBreakdown.year.compareTo(duration.getEndDate().getYear()) > 0
                    || yearlyBreakdown.year.compareTo(duration.getStartDate().getYear()) < 0 ) {
                iterator.remove();
            }
        }
        //other cases skipped....
    }

    public List<YearlyBreakdown> getData() {
        return data;
    }

    public void addYearlyBreakdown( YearlyBreakdown yearlyBreakdown){
        data.add(yearlyBreakdown);
    }

    public static class YearlyBreakdown {
        public final Integer year;
        public final BigDecimal amount;

        public YearlyBreakdown(Integer year, BigDecimal amount) {
            this.year = year;
            this.amount = amount;
        }
    }
}
