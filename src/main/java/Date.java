import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import static java.lang.System.*;

public class Date {

    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds();

        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.now();
        date.isBefore(date2);

        out.println(date.plus(Period.ofDays(2)));
    }
}
