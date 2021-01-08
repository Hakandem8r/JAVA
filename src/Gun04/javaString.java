package Gun04;

public class javaString {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya");
        int sayi = 5;
        String ad = "Hakan";
        String soyad = "Demir";

        System.out.println(ad); //Hakan --> yazılır
        System.out.println("ad"); //ad --> yazılır

        System.out.println(ad + " " + soyad);
        System.out.println("ad" + "soyad");

        //int toplam = a+ b
        String fullname = ad +" "+ soyad;
        System.out.println("fullname = " + fullname);

        int age = 35;
        String bilgi = ad + " " + soyad + " " + age;
        System.out.println("bilgi = " + bilgi);
    }

}
