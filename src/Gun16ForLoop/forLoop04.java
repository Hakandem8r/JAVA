package Gun16ForLoop;

import java.util.Scanner;

public class forLoop04 {
    public static void main(String[] args) {
        //Girilen bir sayının faktoriyelini hesaplayınız
        //5! => 5*4*3*2*1
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();
        int faktor = 1;
        for(int i=1; i<=sayi; i++){
            faktor=faktor*i; // faktor*=i;
        }
        System.out.println("faktor = " + faktor);
    }
}
