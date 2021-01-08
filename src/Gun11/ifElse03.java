package Gun11;

import java.util.Scanner;

public class ifElse03 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = oku.nextInt();

        if (sayi%2==0){
            System.out.println("Sayı çifttir");
        }else{
            System.out.println("Sayı tektir");
        }
    }
}
