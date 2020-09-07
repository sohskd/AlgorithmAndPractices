package Date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class JavaDates {

    public static void main(String[] args) {

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        ZoneId zoneid1 = ZoneId.of("Asia/Singapore");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), zoneid1);

        ZoneId zoneid2 = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(LocalDateTime.now(), zoneid2);


        System.out.println("Done");
    }
}
