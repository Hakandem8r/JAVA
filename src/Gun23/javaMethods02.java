package Gun23;

public class javaMethods02 {
    public static void main(String[] args) {
        int sayi1=5;
        int sayi2=7;

        int sonuc=toplamBul(sayi1, sayi2); //bu şekilde yazmamızın hiçbir farkı yok çünkü
        // işlemin sonucu herhangi bir değişkene atanmadı

        int sayi3=7;
        // bana önceki toplamın değeri lazı, şu anda sonuca toplamın sonucu geldi

        Math.max(3,4); // bu şekild
    }

    public static int toplamBul(int a, int b){
        int toplam=a+b;
        System.out.println("Toplam= " + toplam);

        return toplam;

    }
}
