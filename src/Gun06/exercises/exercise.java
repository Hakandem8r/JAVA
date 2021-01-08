package Gun06.exercises;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayi = ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayi = ");
        int sayi2=input.nextInt();
        int toplam=sayi1+sayi2;
        System.out.print("Toplam = "+ toplam);

    }
}
