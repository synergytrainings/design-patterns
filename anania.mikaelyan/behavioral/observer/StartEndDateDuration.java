package com.synisys.training.patterns.behavioral.observer;

import org.joda.time.LocalDate;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Anania.Mikaelyan
 * @since 4/6/2015
 */
public class StartEndDateDuration extends Observable {
    private LocalDate startDate;
    private LocalDate endDate;

    public void setDates(LocalDate startDate, LocalDate endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        notifyObservers();
    }

    @Override
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
}
