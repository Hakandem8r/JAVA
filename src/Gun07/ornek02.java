package Gun07;

import java.util.Scanner;

public class ornek02 {
    public static void main(String[] args) {
        // soru: Kullanıcıdan tek bir komutta okunan 2 kelimelik ad ve soyaı
        // tek okumada alınız -> "Adınızı ve Soyadınızı giriniz"
        // ekrana ilk harfleri ve nokta şekilde
        // yazdırınız. Örnek: Ahmet Yılmaz -> A.Y.

        System.out.println("Adınız ve Soyadınız = ");
        Scanner input=new Scanner(System.in);
        String adSoyad = input.nextLine(); // birden fazla kelime, yani satırı tümden okuyun

        char adIlkHarf = adSoyad.charAt(0);
        int boslukNerde = adSoyad.indexOf(" "); // bu indexin bir fazlası her zaman soyadını verir
        char soyAdIlkHarf = adSoyad.charAt(boslukNerde+1);

        System.out.println(adIlkHarf+"."+soyAdIlkHarf+".");


    }
}
