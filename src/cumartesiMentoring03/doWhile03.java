package cumartesiMentoring03;

import java.util.Scanner;

public class doWhile03 {
    public static void main(String[] args) {
        //TODO... GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;

        do{

            toplam += sayi % 10;
            sayi = sayi / 10;
            System.out.println("Basamağın Toplamı= "+ toplam + " kalan sayı" + sayi);

        }while(sayi > 0);
        System.out.println("Toplam= "+toplam);
    }
}
