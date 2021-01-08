package Gun05;

public class ornek2Hoca {
    public static void main(String[] args) {

        short sayi1 = 126;
        short sayi2 = 200;

        byte sayi3 = (byte) sayi1;
        byte sayi4 = (byte) sayi2;

        System.out.println("sayi3 = " + sayi3);
        System.out.println("sayi4 = " + sayi4);

        // byte 127'ye kadar olduğu için büyük olan 200 sayısını daha küçük olan byte'a
        // dönüştürdüğümüzde -56 gibi saçma bir sonuç çıkıyor. Çünkü büyükten küçüğe dönüştürüyoruz!
    }
}
