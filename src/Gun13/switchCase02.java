package Gun13;

import java.util.Scanner;

public class switchCase02 {
    public static void main(String[] args) {
        //girilen bir sayının onlar basamağının değerini yazı ile yaz

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz= ");
        int sayi = sc.nextInt();
        int onlarBasamagi = (sayi/10)%10;
        switch(onlarBasamagi){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("İki");
                break;
            case 3:
                System.out.println("Üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("Altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Geçersiz bir sayı girdiniz");
        }
    }
}
