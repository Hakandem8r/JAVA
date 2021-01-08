package Gun07;

public class equals {
    public static void main(String[] args) {
        // 2 String'in eşit olup olmadığını kontrol eder ve sonuç boolean değişkenidir.
        // büyük-küçük harfe dikkat!

        String str = "Merhaba";
        boolean birebirEsitMi = str.equals("Merhaba");

        System.out.println("Birebir eşit mi = "+ birebirEsitMi);

        System.out.println("Birebir eşit mi = "+ str.equals("merhaba"));

        System.out.println("..................................................");

        String str2 = "Kitaplar";
        System.out.println("str2 eşit mi = " + str2.equals("Kitaplar"));

    }
}
