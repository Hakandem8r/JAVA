package Gun10;

import java.util.Scanner;

public class if07 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("3 sayı giriniz = ");
        int a = scr.nextInt();
        int b = scr.nextInt();
        int c = scr.nextInt();

        int enBuyuk = a;

        if(enBuyuk<b){
            enBuyuk = b;
        }
        if(enBuyuk<c){
            enBuyuk = c;
        }
        System.out.println("En büyük sayı = " + enBuyuk);
    }
}
