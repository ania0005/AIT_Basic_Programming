package time.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class DateOperation {
    public static int getAge(String birthDate) {
        LocalDate date = mapStringToLocalDate(birthDate);
        return (int) ChronoUnit.YEARS.between(date, LocalDate.now());
    }

    public static String[] sortStringDates(String[] dates) {
        String[] res = Arrays.copyOf(dates, dates.length);
        Arrays.sort(res, (d1, d2) -> mapStringToLocalDate(d1).compareTo(mapStringToLocalDate(d2)));
        return res;
    }
    private static LocalDate mapStringToLocalDate(String stringDate) {
        LocalDate res = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]"));
//		if (stringDate.contains("-")) {
//			res = LocalDate.parse(stringDate, DateTimeFormatter.ISO_LOCAL_DATE);
//		} else {
//			res = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//		}
        return res;
    }
}