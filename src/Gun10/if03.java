package Gun10;

import java.util.Scanner;

public class if03 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz = ");
        int sayi = oku.nextInt();

        if(sayi>0){
            System.out.print("Sayı pozitiftir" );
        }
        if(sayi<0){
            System.out.println("Sayı negatiftir");
        }
        if(sayi==0){
            System.out.println("Sayı sıfırdır");
        }
    }
}
