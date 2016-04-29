package com.goda5.hagendaz.common;

import com.beust.jcommander.internal.Lists;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;

import java.util.List;

/**
 * Created by tong on 24/04/2016.
 * @see <a href="https://www.gov.uk/government/publications/entry-clearance-visas-by-length/entry-clearance-visas-by-length">UKBA 180 days rule</a>
 */
public class UkbaCalc {
    private static final String CHECKING_PERIOD_START = "2015-01-01";
    private static final String CHECKING_PERIOD_END = "2025-01-01";
    private static final int UKBA_DAYS_CHECKING_PERIOD = 365;
    private static final int UKBA_DAYS_LIMIT = 180;


    public static void main(String[] args) throws IllegalAccessException {
        List<Interval> intervals = setupDaysSpendInTheUK();

        for(int j = 0; j<getDaysBetween(CHECKING_PERIOD_START, CHECKING_PERIOD_END); j++) {
            long counter = 0;
            DateTime start = DateTime.parse(CHECKING_PERIOD_START).plusDays(j);
            DateTime end = start.plusDays(UKBA_DAYS_CHECKING_PERIOD);

            Interval checkingPeriod = new Interval(start, end);

            for(Interval interval:intervals) {
                if(checkingPeriod.overlaps(interval)) {
                    counter += checkingPeriod.overlap(interval).toDuration().getStandardDays();
                }
            }

//            System.out.printf("%s days stayed during 365 days period of %s\n", counter, checkingPeriod);
            if(counter > UKBA_DAYS_LIMIT) {
                throw new IllegalAccessException("UKBA not happy " + checkingPeriod);
            }
        }
    }

    @NotNull
    private static List<Interval> setupDaysSpendInTheUK() {
        List<Interval> intervals = Lists.newArrayList();
        intervals.add(new Interval(DateTime.parse("2015-05-11"), DateTime.parse("2015-10-15")));
        intervals.add(new Interval(DateTime.parse("2016-05-07"), DateTime.parse("2016-07-07")));
        intervals.add(new Interval(DateTime.parse("2016-12-31"), DateTime.parse("2017-04-30")));
//        intervals.add(new Interval(DateTime.parse("2017-09-30"), DateTime.parse("2018-03-25")));

        return intervals;
    }

    private static int getDaysBetween(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);
        return Days.daysBetween(startDate, endDate).getDays();
    }


}
