package Gun38.nonAccesModifier.staticModifier;

public class Ogrenci {
    String ad;
    String soyad;
    int sinifi;
    static String okulAd="Yıldırım";
    //Static kullanarak hafızayı tekrardan korumak!!

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
        //this.okulAd = okulAd;
    }

    void print()
    {
        System.out.println(ad+" "+soyad+" "+okulAd);
    }
}
