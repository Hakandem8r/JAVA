package Gun41.creatingAndFormatting;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaLocalTime {
    public static void main(String[] args) {
        //todo Tarih içermez sadece saat, dakika, saniye içerir = 9:00 am gibi
        LocalTime time1= LocalTime.now();

        LocalTime time2=LocalTime.of(21, 12);
        LocalTime time3=LocalTime.of(21, 45, 12);
        
        //o anda alınan bilgiler
        System.out.println("time1.getHour = " + time1.getHour());
        System.out.println("time1.getMinute = " + time1.getMinute());
        System.out.println("time1.getSecond = " + time1.getSecond());
        System.out.println("time1.getNano = " + time1.getNano());

                                       //a: am, pm localizasyon türkçe olduğu için ÖÖ, ÖS
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("time1.format(format1) = " + time1.format(format1));

        DateTimeFormatter format2=DateTimeFormatter.ofPattern("HH:mm:ss");// HH 24 lü saat sistemine göre
        System.out.println("time1.format(format2)= " + time1.format(format2));

        System.out.println("time1 = " + time1);
        LocalTime time4=LocalTime.now();
        System.out.println("time4 = " + time4);
        
        
    }
}
