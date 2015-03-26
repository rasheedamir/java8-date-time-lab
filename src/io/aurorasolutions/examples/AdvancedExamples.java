package io.aurorasolutions.examples;

import java.time.LocalDate;

public class AdvancedExamples {

    private final QuarterOfYearQuery quarterOfYearQuery = new QuarterOfYearQuery();
    private final NextMartinLutherKingDayQuery nextMartinLutherKingDayQuery = new NextMartinLutherKingDayQuery();

    /**
     *
     * @param date
     * @return
     */
    public Quarter getQuarterOfYear(LocalDate date) {
        return date.query(quarterOfYearQuery);
    }

    /**
     *
     * @param date
     * @return
     */
    public LocalDate getNextMartinLutherKingDay(LocalDate date) {
        return date.query(nextMartinLutherKingDayQuery);
    }
}
