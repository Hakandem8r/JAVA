package Gun13;

import java.util.Scanner;

public class icIceIfDonguleri {
    public static void main(String[] args) {
        // Grilen bir sayının önce 100 den küçük ise, 100 den küçük yazsın,
        // devamında 50 den küçük ise 50 den küçük yazsın
        // devamında 25 ten küçük ise 25 ten küçük yazsın

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = oku.nextInt();
        if (sayi < 100) {
            System.out.println("Sayı 100'den küçük");
            if (sayi < 50) {
                System.out.println("Sayı 50'den küçük");
                if(sayi < 25) {
                    System.out.println("Sayı 25'ten küçük");
                }
            }
        }
    }
}

