package io.aurorasolutions.examples;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.*;

public class QuarterOfYearQuery implements TemporalQuery<Quarter> {

    /**
     *
     * @param temporal
     * @return
     */
    @Override
    public Quarter queryFrom(TemporalAccessor temporal) {
        LocalDate now = LocalDate.from(temporal);

        if(now.isBefore(now.with(Month.APRIL).withDayOfMonth(1))) {
            return Quarter.FIRST;
        } else if(now.isBefore(now.with(Month.JULY).withDayOfMonth(1))) {
            return Quarter.SECOND;
        } else if(now.isBefore(now.with(Month.NOVEMBER).withDayOfMonth(1))) {
            return Quarter.THIRD;
        } else {
           return Quarter.FOURTH;
        }
    }
}
