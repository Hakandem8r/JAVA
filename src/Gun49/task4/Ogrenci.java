package Gun49.task4;

public class Ogrenci {
    //1-Ogrenci isimli id, isim ve tipi (ilk, lise) olan bir class oluşturunuz.
   //2-LiseOgrenci adında Ogrenci sınıfından bir sınıf uretiniz.
   //3-IlkOgrencisi adında Ogrenci sınıfından bir sınıf uretiniz.
   //4-Okul isimli main de 3 adet öğrenci oluşturunuz.
   //5-Oluştururken her ogrenciye, Ogrenci sınıfında tanımlanmış bir sayac tan no veriniz

    int id;
    String isim;
    String tipi;

    public  static int sayacID=1;

    public Ogrenci(int id, String isim, String tipi) {
        this.id = id;
        this.isim = isim;
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi='" + tipi + '\'' +
                '}';
    }
}
