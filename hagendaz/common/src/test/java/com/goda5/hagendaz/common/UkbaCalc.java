package com.goda5.hagendaz.common;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Interval;
import org.joda.time.LocalDate;

/**
 * Created by tong on 24/04/2016.
 * @see <a href="https://www.gov.uk/government/publications/entry-clearance-visas-by-length/entry-clearance-visas-by-length">UKBA 180 days rule</a>
 */
public class UkbaCalc {
    public static void main(String[] args) throws IllegalAccessException {
        Interval interval = new Interval(DateTime.parse("2015-05-11"), DateTime.parse("2015-10-15"));
        Interval interval2 = new Interval(DateTime.parse("2016-05-07"), DateTime.parse("2016-07-07"));
        Interval interval3 = new Interval(DateTime.parse("2016-09-07"), DateTime.parse("2016-12-07"));

        for(int j=0;j<getDaysBetween("2015-01-01", "2018-01-01");j++) {
            long counter = 0;
            DateTime start = DateTime.parse("2015-01-01").plusDays(j);
            DateTime end = start.plusDays(365);

            Interval checkingPeriod = new Interval(start, end);

            if(checkingPeriod.overlaps(interval)) {
                counter += checkingPeriod.overlap(interval).toDuration().getStandardDays();
            }
            if(checkingPeriod.overlaps(interval2)) {
                counter += checkingPeriod.overlap(interval2).toDuration().getStandardDays();
            }
            if(checkingPeriod.overlaps(interval3)) {
                counter += checkingPeriod.overlap(interval3).toDuration().getStandardDays();
            }
            System.out.println(counter);
            if(counter > 180) {
                throw new IllegalAccessException("UKBA not happy" + checkingPeriod);
            }
        }
    }

    private static int getDaysBetween(String date1, String date2) {
        LocalDate startDate = LocalDate.parse(date1);
        LocalDate endDate = LocalDate.parse(date2);
        return Days.daysBetween(startDate, endDate).getDays();
    }


}
