package Gun10;

import java.util.Scanner;

public class if08 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Bir sayı giriniz = ");
        int sayi = scr.nextInt();

        int onlar = (sayi/10) % 10; // onlar basamağını verir

        if(onlar % 2 == 0){
            System.out.println("Çifttir.");
        }
        if(onlar % 2 == 1){
            System.out.println("Tektir.");
        }


    }
}
