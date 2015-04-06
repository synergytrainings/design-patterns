package com.synisys.training.patterns.behavioral.observer;

import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author Anania.Mikaelyan
 * @since 4/6/2015
 */
public class Commitments implements Observer {
    List<Commitment> data = new ArrayList<>(5);
    @Override
    public void update(Observable o, Object arg) {
        //cast is unpreventable if using java.util observer
        if(!(o instanceof StartEndDateDuration)){
            throw new IllegalArgumentException("Commitments subscribe to StartEndDuration only" );
        }
        StartEndDateDuration duration = (StartEndDateDuration)o;
        Iterator<Commitment> iterator = data.iterator();
        while (iterator.hasNext()) {
            Commitment commitment = iterator.next();
            if(commitment.date.isAfter(duration.getEndDate()) || commitment.date.isBefore(duration.getStartDate())){
                iterator.remove();
            }
        }
    }

    public List<Commitment> getData() {
        return data;
    }

    public void addCommitment( Commitment commitment){
        data.add(commitment);
    }

    public static final class Commitment {
        public final LocalDate date;
        public final BigDecimal amount;
        public final String description;

        public Commitment(LocalDate date, BigDecimal amount, String description) {
            this.date = date;
            this.amount = amount;
            this.description = description;
        }
    }
}
