package Gun12;

import java.util.Scanner;

public class ternary02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();

        int sonuc = (sayi > 50) ? 1 : 0;

        System.out.println("Sonuç: " + sonuc);

        }
    }

