package aaaExercises;

import java.util.Scanner;

public class isim {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı2 ayrı kelimeye ayır!
        // ad ayrı soyad ayrı şekilde ekrana yazdır --> Ahmet Yılmaz

        Scanner sc = new Scanner(System.in);
        System.out.print("Ad soyad giriniz: ");
        String adSoyad = sc.nextLine();

        int boslukIndex = adSoyad.indexOf(" ");
        String ad = adSoyad.substring(0, boslukIndex);
        String soyad = adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);


    }
}
