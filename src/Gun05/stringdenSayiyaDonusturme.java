package Gun05;

public class stringdenSayiyaDonusturme {
    public static void main(String[] args) {
        // String'den sayıya dönüştürme
        String ekrandanGelen1 = "500"; // 1. Bağış
        String ekrandanGelen2 = "1000"; // 2. Bağış

        //int toplamBagis = ekrandanGelen1 + ekrandanGelen2;
        //bu şekilde toplanmaz çünkü rakam gibi gözüken semboller bunlar, sayı değil!
        
        int bagis1 = Integer.parseInt(ekrandanGelen1); //artık sayısal değere döndü
        int bagis2 = Integer.parseInt(ekrandanGelen2); //artık sayısal değere döndü
        //"PARSE" güzel bir şekilde karşı tarafa dönüştürmek anlamına gelir.
        
        int toplamBagis = bagis1 + bagis2; //sayi haline dönüştürülünce toplanabilir
        System.out.println("toplamBagis = " + toplamBagis);

        System.out.println("..............................");
        //SORU 9: STRİNG OLARAK VERİLEN KARENİN 1 KENAR UZUNLUĞUNDAN KARENİN ÇEVRESİNİN uzunluğunu bul

        String a = "30";
        int kenar1 = Integer.parseInt(a);
        int cevre = 4*kenar1;
        System.out.println("cevre = " + cevre);

        System.out.println(".........................");
        //HOCA
        String kenarUzunlugu = "5";
        int kenarInt = Integer.parseInt(kenarUzunlugu);
        int ccevre = kenarInt + kenarInt + kenarInt + kenarInt;
        System.out.println("ccevre = " + ccevre);

        System.out.println("..................................");

        //SORU: String olarak verilen true veya false değerini, boolean
        // türüne çevirip yazdır.

        String x = "true";

        boolean y = Boolean.parseBoolean(x);

        System.out.println("y = " + y);

        System.out.println("....................................");

        String trueAnswer = "true";
        boolean result = Boolean.parseBoolean(trueAnswer);
        System.out.println("result = " + result);

        System.out.println(".........................................");
        //HOCA
        String cevapEvet = "true";
        String cevapHayir = "false";

        Boolean cevapE = Boolean.parseBoolean(cevapEvet);
        Boolean cevapH = Boolean.parseBoolean(cevapHayir);
        System.out.println("cevaplarınız = " + cevapE +" "+ cevapH);

        System.out.println("......................................................");
        //Soru: String olarak verilen Gece ve Gündüz hava sıcaklığı bilgisinin toplamını yazdır

        String dayWeather = "29";
        String nightWeather = "15";

        int day = Integer.parseInt(dayWeather);
        int night = Integer.parseInt(nightWeather);

        System.out.println("ANSWERS = " + day + " / " + night);

        System.out.println("..................................................");
        // Hocanın cevabı:

        String geceStr = "10";
        String gündüzStr = "25";

        int geceDerece = Integer.parseInt(geceStr);
        int gündüzDerece = Integer.parseInt(gündüzStr);

        int toplamDerce = geceDerece + gündüzDerece;

        System.out.println("toplamDerce = " + toplamDerce);





        



    }
}
