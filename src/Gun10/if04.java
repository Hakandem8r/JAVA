package Gun10;

import java.util.Scanner;

public class if04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen birinci sayı giriniz = ");
        int sayi1 = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz ");
        int sayi2 = input.nextInt();

        if(sayi1>sayi2){
            System.out.println("sayi1, sayi2'den büyüktür");
        }
        if(sayi1<sayi2){
            System.out.println("sayi1, sayi2'den küçüktür");
        }
        if(sayi1==sayi2){
            System.out.println("sayılar birbirine eşittir");
        }
    }
}
