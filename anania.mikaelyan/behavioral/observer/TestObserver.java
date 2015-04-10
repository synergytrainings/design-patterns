package com.synisys.training.patterns.behavioral.observer;

import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author Anania.Mikaelyan
 * @since 4/6/2015
 */
public class TestObserver {

    @Test
    public void test() {
        Commitments commitments = new Commitments();
        commitments.addCommitment(new Commitments.Commitment(LocalDate.parse("2012-04-17"), BigDecimal.TEN, "Com_2012"));
        commitments.addCommitment(new Commitments.Commitment(LocalDate.parse("2013-04-17"), BigDecimal.TEN, "Com_2013"));
        commitments.addCommitment(new Commitments.Commitment(LocalDate.parse("2014-04-17"), BigDecimal.TEN, "Com_2014"));
        commitments.addCommitment(new Commitments.Commitment(LocalDate.parse("2015-04-17"), BigDecimal.TEN, "Com_2015"));

        YearlyBreakdowns yearlyBreakdowns = new YearlyBreakdowns();
        yearlyBreakdowns.addYearlyBreakdown(new YearlyBreakdowns.YearlyBreakdown(2012, BigDecimal.TEN));
        yearlyBreakdowns.addYearlyBreakdown(new YearlyBreakdowns.YearlyBreakdown(2013, BigDecimal.TEN));
        yearlyBreakdowns.addYearlyBreakdown(new YearlyBreakdowns.YearlyBreakdown(2014, BigDecimal.TEN));
        yearlyBreakdowns.addYearlyBreakdown(new YearlyBreakdowns.YearlyBreakdown(2015, BigDecimal.TEN));

        StartEndDateDuration duration = new StartEndDateDuration();
        duration.setDates(LocalDate.parse("2012-04-17"), LocalDate.parse("2015-04-17"));
        duration.addObserver(commitments);
        duration.addObserver(yearlyBreakdowns);
        duration.setDates(LocalDate.parse("2013-04-17"), LocalDate.parse("2014-04-17"));

        Assert.assertEquals(commitments.getData().size(), 2);
        Assert.assertEquals(yearlyBreakdowns.getData().size(), 2);

    }
}
