package Gun05;

public class sayilarArasiDonusum {
    public static void main(String[] args) {
        // sayılar arası dönüşüm

        int sayi = 5;
        double rakam = 55.67;

        rakam = sayi; //otomatik rakam = (double) sayi
        sayi = (int) rakam; // manuel

        // sayıyı string dönüştürme

        String yazi = Integer.toString(sayi);
        String yazi2 = Double.toString(rakam);

        System.out.println("yazi = " + yazi);
        System.out.println("yazi2 = " + yazi2);

        System.out.println("..........................");

        // Soru = Short olarak atadığın değeri string'e çevir ve ekrana yazdır

        short sayia = 345;
        String kelimeHali = Short.toString(sayia);

        System.out.println("kelimeHali = " + kelimeHali);

        int sayi2 = 245; // sayı değeri taşır matematiksel işleme girer
        String kelimeHali2 = "245"; // sayı değeri taşımaz sadece sembol

        int top = 34 + sayi2;
        // int top2 = 34 + kelimeHali2; // BU ŞEKİLDE KULLANILMAZ!!!

    }
}

