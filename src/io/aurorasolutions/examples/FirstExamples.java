package io.aurorasolutions.examples;

import java.time.*;

public class FirstExamples {

    /**
     * Create a simple Date - Henry VIII Birthday - June 28th 1491
     *
     * Hint: LocalDate.of(1491, Month.JUNE, 28);
     * @return
     */
    public LocalDate getHenrysBirthday() {
        return LocalDate.of(1491, Month.JUNE, 28);
    }

    /**
     * Create a simple Time - 13:51
     *
     * Hint: LocalTime.of(13, 51);
     * @return
     */
    public LocalTime getSampleLocalTime() {
        return LocalTime.of(13, 51);
    }

    /**
     * Create a sample LocalDateTime of the above
     *
     * Hint: LocalDateTime.of(1491, Month.JUNE, 28, 13, 51);
     * @return
     */
    public LocalDateTime getSampleLocalDateTime() {
        return LocalDateTime.of(1491, Month.JUNE, 28, 13, 51);
    }

    /**
     *
     * Hint: LocalDateTime.of(getHenrysBirthday(), getSampleLocalTime());
     * @return
     */
    public LocalDateTime getComponentDateTime() {
        return LocalDateTime.of(getHenrysBirthday(), getSampleLocalTime());
    }

    /**
     * Hint: LocalDateTime.now().toLocalDate();
     * @return
     */
    public LocalDate getTodayFromLocalDateTime() {
        return LocalDateTime.now().toLocalDate();
    }

    /**
     * Hint:
     * ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
     * ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
     * paris.getHour() - london.getHour();
     * @return
     */
    public int getDifferenceBetweenParisAndLondon() {
        ZonedDateTime paris = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        return paris.getHour() - london.getHour();
    }
}