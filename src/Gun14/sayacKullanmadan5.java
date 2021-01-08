package Gun14;

import java.util.Scanner;

public class sayacKullanmadan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = sc.nextInt();

        int toplam = 0;
        while (sayi > 0){
            toplam = toplam + sayi;
            sayi--;
        }
        System.out.println("toplam = " + toplam);
    }
}
