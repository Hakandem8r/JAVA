package Gun14;

import java.util.Scanner;

public class doWhile9 {
    public static void main(String[] args) {
        // Kullanıcıdan x (strin) girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde "program bitti" yazan programı yazınız.

        Scanner oku = new Scanner(System.in);
        String okunan = "";

        do {
            okunan = oku.nextLine();
            if (okunan.equalsIgnoreCase("x")) break; // break : döngü kırıcı

            System.out.println("Program çalışıyor");
        } while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program bitti.");
    }
}