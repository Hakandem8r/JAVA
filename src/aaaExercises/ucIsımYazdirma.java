package aaaExercises;

import java.util.Scanner;

public class ucIsımYazdirma {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 3 kelimelik ismin her kelimesini ayırarak ayrı ayrı yazdır
        //Örn. Ahmet Emin Yıldız

        Scanner read = new Scanner(System.in);
        System.out.print("Ad Soyad giriniz: ");
        String adAd2Soyad = read.nextLine();
        
        int bosluk1 = adAd2Soyad.indexOf(" ");
        int bosluk2 = adAd2Soyad.lastIndexOf(" ");
        
        String ad = adAd2Soyad.substring(0,bosluk1);
        String ad2 = adAd2Soyad.substring((bosluk1+1),bosluk2);
        String soyad = adAd2Soyad.substring(bosluk2+1);

        System.out.println("ad = " + ad);
        System.out.println("ad2 = " + ad2);
        System.out.println("soyad = " + soyad);
    }
}
