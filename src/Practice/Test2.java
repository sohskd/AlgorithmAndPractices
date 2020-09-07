package Practice;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.*;

public class Test2 {

    public static void main(String[] args) {

        SimpleDateFormat format = new SimpleDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        format.setTimeZone(TimeZone.getTimeZone("UTC"));

        Date d = new Date();
        System.out.println(format.format(d));
        System.out.println(LocalDateTime.now());
    }
}
