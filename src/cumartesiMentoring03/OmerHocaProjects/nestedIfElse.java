package cumartesiMentoring03.OmerHocaProjects;

import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("sayı= ");
        int sayi=sc.nextInt();

        if (sayi < 100) {
            System.out.println("100'den küçük");

            if (sayi < 50) {
                System.out.println("50'den küçük");

                if (sayi < 25) {
                    System.out.println("25'ten küçük");
                }
            }
        }else
            System.out.println("100'den büyüktür");
    }
}
