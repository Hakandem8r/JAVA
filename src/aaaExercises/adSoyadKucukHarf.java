package aaaExercises;

import java.util.Scanner;

public class adSoyadKucukHarf {
    public static void main(String[] args) {
        // Girilen 2 kelimelik ad ve soyadların ilk harflerinin hepsini
        // küçük ve daha sonra büyük hallerini yazdırınız! Ahmet Yıldız -> ahmet yıldız ay AY
        Scanner read = new Scanner(System.in);
        System.out.print("ad soyad giriniz: ");
        String tamAd = read.nextLine();

        int boslukIndex = tamAd.indexOf(" ");
        String ilkHarf = tamAd.substring(0,1).toLowerCase(); // a
        String soyadiIlkHarf = tamAd.substring(boslukIndex+1, boslukIndex+2).toLowerCase(); //y

        System.out.println("tamAd = " + tamAd);
        System.out.println("ilkHarf = " + ilkHarf);
        System.out.println("soyadiIlkHarf = " + soyadiIlkHarf);
        System.out.println(ilkHarf+(tamAd.substring(1,boslukIndex).toLowerCase())+" "+
                        soyadiIlkHarf+ tamAd.substring(boslukIndex+2).toLowerCase());



    }
}
