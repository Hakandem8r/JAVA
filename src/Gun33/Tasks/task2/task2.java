package Gun33.Tasks.task2;

import java.util.ArrayList;

public class task2 {
    // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
    // 1- Ders sınınıfı ayrı dosyada : adı: Lesson , fields : name, credit (1-3 arasında değer alıyor)
    // 2- Öğrenci Sınıfı ayrı dosyada: adı: Student, fields : name, maxCredit, dersleri listesini
    // tutacak bir liste
    // 3- 3 adet ders oluşturunuz.
    //4- 1 adet öğrenci tanımlayınız alabileceği maxCredit sayısı 10 olsun.
    //5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz,
    //   fakat ders eklerken max alabileceği krediyi geçmemeli!!!
    //   geçerse uyarı versin "alabileceğiniz max credi doldu" şeklinde.
    //ÖDEV
    //6-Aşağıdaki ders oluşturma kısmı için ilgili sınıfta lessonCreate adında
    //bir metod oluşturunuz.
    //7-Öğrenciye ders ekleme bölümünü yine ilgili sınıfta bir metod olarak yazınız.


    public static void main(String[] args) {

        // Lesson math=Lesson.createLesson("Math", 4);

        /*TODO ALTERNATİF => School okul=new School();
                             okul.Ad="sdsdsds";
                             okul.Adres="dfdfdfd"
                             -->
                             Student.SchoolInfo=okul;
         */

        Lesson mat101 = new Lesson();
        mat101.name = "Matematik";
        mat101.credit = 3;

        Lesson java101 = new Lesson();
        java101.name = "Java programming";
        java101.credit = 6;

        Lesson fiz101 = new Lesson();
        fiz101.name = "Fizik";
        fiz101.credit = 4;

        Student ogr1 = new Student();
        ogr1.name = "Ali";
        ogr1.maxCredit = 10;

        ogr1.dersListesi = new ArrayList<>();
        //Buraya kadar konacak toplam aldığı krediye bakılarak
        //eklenecek ders ile öğrencinin o ana kadarki kredisi toplamı
        //öğrencinin alabileceği max krediyi aşmıyorsa ekle

        if (ogr1.totalCredit() + mat101.credit <= ogr1.maxCredit) {
            ogr1.dersListesi.add(mat101);
        } else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu");
        }

        if (ogr1.totalCredit() + fiz101.credit <= ogr1.maxCredit) {
            ogr1.dersListesi.add(fiz101);
        } else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu");
        }

        if (ogr1.totalCredit() + java101.credit <= ogr1.maxCredit) {
            ogr1.dersListesi.add(java101);
        } else {
            System.out.println("Alabileceğiniz Kredi miktarı doldu");
        }

    }


}
