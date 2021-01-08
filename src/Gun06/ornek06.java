package Gun06;

import java.util.Scanner;

public class ornek06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cadde:");
        String cadde = scanner.nextLine();

        System.out.print("Sokak:");
        String sokak = scanner.nextLine();

        System.out.print("Ülke:");
        String ulke = scanner.nextLine();

        System.out.print("Posta Kodu:");
        int pk = scanner.nextInt();

        System.out.print("Cadde: "+ cadde + ", "+ "Sokak: "+ sokak+ ", " +
                "Posta Kodu: "+ pk + ", "+ "Ülke: "+ ulke);


    }
}
