package Gun12;

import java.util.Scanner;

public class ternary3Java {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("sayi =");
        int sayi= oku.nextInt();

        String text="";

//        if (sayi % 2 == 0)
//            text = "çift";
//        else
//            text = "tek";

        // ternary şekli (üçlü operatör şekli) / Üçlü operator => " =, ?, : "

        text = (sayi % 2 == 0) ? "çift" : "tek";

        System.out.println(text);
    }
}