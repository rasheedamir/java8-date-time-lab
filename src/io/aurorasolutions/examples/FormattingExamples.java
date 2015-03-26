package io.aurorasolutions.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingExamples {

    /**
     *
     * @return
     */
    public String formatSimpleDate() {
        return LocalDate.now().format(DateTimeFormatter.ISO_DATE);
    }

    /**
     * format: "DD/MM/yyyy"
     * @return
     */
    public String formatMonthDayYear() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("DD/MM/yyyy"));
    }

    /**
     *
     * @param dateString
     * @return
     */
    public LocalDate parseLocalDate(String dateString) {
        return LocalDate.parse(dateString);
    }
}