package Gun41.creatingAndFormatting;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class JavaZonedDateTime {
    public static void main(String[] args) {
        //Başka ülke veya bölgelerin saat dilimine göre zamanı alma

        ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zdtLocal=ZonedDateTime.now();

        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("zdtLocal = " + zdtLocal);
        System.out.println("zdt = " + zdt);

      /* Set<String> bolgeler=ZoneId.getAvailableZoneIds();

        for (String s:bolgeler) {
            System.out.println("s = " + s);
        } */

    }
}
