package Gun12;

import java.util.Scanner;

public class javaMath02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz= ");
        int sayi1 = sc.nextInt();

        System.out.print("2. sayıyı giriniz = ");
        int sayi2 = sc.nextInt();

        System.out.print("3. sayıyı giriniz = ");
        int sayi3 = sc.nextInt();

        System.out.println("En büyük = "+ Math.max(Math.max(sayi1, sayi2), sayi3));
//System.out.println("Max sayı: "+Math.max(Math.max(Math.max(Math.max(sayı1,sayı3),sayı4),sayı2),sayı3));
// dortlu max bulma
    }
}
