package Gun14;

import java.util.Scanner;

public class whileLoop4 {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayıların toplamını bularak yazdırınız.
        //Girilen sayı dahil.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = sc.nextInt();
        
        int sayac = 5;
        int toplam = 0;

        while (sayac < sayi){
            
            toplam = toplam + sayac;
            sayac++;
        }
        System.out.println("toplam = " + toplam);
    }
}
