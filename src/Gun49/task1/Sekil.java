package Gun49.task1;

public class Sekil {
    //1-Aşağıdaki hiyerarşiye göre sınıfları oluşturunuz:

    // Shape
    // Circle
    // Rectangle
    // Square

    //2-Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genişlik ekleyiniz.
    //3-Her bir sınıfa constructor ekleyiniz.
    //4-Her metodun toString ini override yapınız.
    //5-Her sınıfa aln ve çevre hesaplaması metodlarını ekleyiniz.
    //6-main de bunlardan nesne oluşturup sonuçları yazdırınız.
    //7-En üst sınıfta türetilen sınıflarda uygun metodu olamayan sınıflar için hata mesajı ürettiriniz


    @Override
    public String toString() {
        return "Sekil : Bilgi yok ";
    }

    public double getAlan()
    {
        throw new RuntimeException("Bu sınıfın bu metod özelliği yoktur");
    }

    public  double getCevre()
    {
        throw new RuntimeException("Bu sınıfa bu metod implemente edilmemiştir");
    }


}
