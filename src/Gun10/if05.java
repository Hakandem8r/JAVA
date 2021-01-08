package Gun10;

import java.util.Scanner;

public class if05 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Bir sayı giriniz = ");
        int sayi = scr.nextInt();

        if(sayi % 2 == 1){
            System.out.println("Sayi tektir");
        }
        if(sayi % 2 == 0){
            System.out.println("Sayi çifttir");
        }
    }
}
