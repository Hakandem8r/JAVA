package Gun41.periodAndDuration;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaPeriod {
    public static void main(String[] args) {
        //Period: 2 tarih arasında geçen zamanı yıl, ay, gün olarak veriyor

        LocalDate dt=LocalDate.of(1973, 02, 21);
        LocalDate bugun=LocalDate.now();

        Period fark=Period.between(dt, bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = " + fark.getYears() + " Yıl, " + fark.getMonths() + " ay, " + fark.getDays() +" gün");

       // DateTimeFormatter format1=DateTimeFormatter.ofPattern("yy.mm.dd"); => Format burda çalışmadı
        //Bunda format yok!!!!!!!!
    }
}
