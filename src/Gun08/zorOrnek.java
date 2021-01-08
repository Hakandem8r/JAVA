package Gun08;

import java.util.Scanner;

public class zorOrnek {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı2 ayrı kelimeye ayır!
        // ad ayrı soyad ayrı şekilde ekrana yazdır

        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen adınızı ve soyadınızı giriniz = ");
        String adSoyad=oku.nextLine();

        //Ahmet Yılmaz substring (başlangıç index, e kadar, dahil değil!)
        int boslukIndex = adSoyad.indexOf(" ");

        String ad = adSoyad.substring(0, boslukIndex);
        String soyad = adSoyad.substring(boslukIndex+1);

        System.out.println("ad = "+ ad);
        System.out.println("Soyad = "+ soyad);

    }
}
