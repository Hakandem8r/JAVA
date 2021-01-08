package Gun07;

public class equalsIgnoreCase {
    public static void main(String[] args) {
        // 2 string'i büyük-küçük karakter ayrımı yapmadan karşılaştırır.
        // sonuç boolean değişkenidir.

        String str = "Merhaba";
        System.out.println("Eşit mi = "+str.equalsIgnoreCase("mERHABA"));
        System.out.println("Eşit mi = "+str.equalsIgnoreCase("mERHa"));


    }
}
