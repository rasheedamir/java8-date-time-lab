package io.aurorasolutions.examples;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondExamples {

    /**
     *
     * Hint:
     * LocalDate today = LocalDate.now();
     * LocalDate tomorrow = today.plusDays(1);
     * @return
     */
    public boolean isTodayAfterTomorrow() {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        return tomorrow.isAfter(today);
    }

    /**
     *
     * Hint: LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
     * @return
     */
    public DayOfWeek getLastDayOfMonth() {
        return LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
    }

    /**
     * Longest day of year June 21st
     *
     * LocalDate today = LocalDate.now();
     * LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
     * Period.between(today, longestDay).getDays();
     * @return
     */
    public int howManyDaysUntilLongestDayOfTheYear() {
        LocalDate today = LocalDate.now();
        LocalDate longestDay = today.with(Month.JUNE).withDayOfMonth(21);
        return Period.between(today, longestDay).getDays();
    }

    /**
     *
     * ZonedDateTime here = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
     * ZonedDateTime gmtNewYear = ZonedDateTime.of(2014, 12, 31, 23, 59, 59, 0, ZoneId.of("Europe/London"));
     * Duration.between(here, gmtNewYear);
     * @return
     */
    public Duration howLongUntilNewYear() {
        ZonedDateTime here = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        ZonedDateTime gmtNewYear = ZonedDateTime.of(2014, 12, 31, 23, 59, 59, 0, ZoneId.of("Europe/London"));

        return Duration.between(here, gmtNewYear);
    }

    /**
     *
     * new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
     * @return
     */
    public LocalDate createDateFromJavaUtilDate() {
        return new Date().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    /**
     *
     * @param year
     * @return
     */
    public List<DayOfWeek> lastDaysOfMonthsInYear(int year) {
//        List<DayOfWeek> list = new ArrayList<>();
//
//        for(Month month : Month.values()) {
//            DayOfWeek day = LocalDate.now().withYear(year)
//                    .with(month).with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
//
//            list.add(day);
//        }
//
//
//        return list;

        //1. Months
        //2. Apply a transformation
        //3. Collect into a list

        return Stream.of(Month.values()).map(month -> LocalDate.now()
                    .withYear(year)
                    .with(month)
                    .with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek())
                .collect(Collectors.toList());
    }
}
