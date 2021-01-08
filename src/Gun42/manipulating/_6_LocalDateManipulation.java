package Gun42.manipulating;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class _6_LocalDateManipulation {
    //todo --- TEST SINIFINDA MAİN OLMAZ!!!!!!!!

    //testPlus adında bir test mmetodu yazınız. Bugünün tarihini alınız. Daha sonra 1 gün, 1 ay
    // ve 1 yıl ekleyerek 2. bir tarih oluşturup, bu tarihin sonucunu Assert ile kontrol ediniz.

    @Test
    public void testPlus() {
        LocalDate bugun = LocalDate.now();
        LocalDate actual = bugun.plusDays(1).plusMonths(1).plusYears(1);

        Assert.assertEquals("Sizin sonucunuz" + actual + "ama sonuç 2021-08-22 olmalı", "2021-08-22", actual.toString());
        //expected: beklenen,  actual ise oluşan demektir

    }

    @Test
    public void testMinus() {

        //testMinus adında bir test metodu yazınız. Bugünün tarihini alınız. Daha sonra 1 gün, 1 ay, 1 yıl
        // çıkartarak 2. bir tarih oluşturup bu tarihin sonucunu Assert ile kontrol ediniz

        LocalDate today = LocalDate.now();
        LocalDate actual = today.minusYears(1).minusMonths(1).minusDays(1);

        Assert.assertEquals("2019-06-20", actual.toString());
    }
}
