package cumartesiMentoring03;

import java.util.Scanner;

public class whileDongusu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("PIN kodunuzu giriniz: ");
        int userPin = sc.nextInt();

        int pinCode = 5555;
        while (userPin != pinCode){
            System.out.println("** Yanlış PIN **");
            System.out.println("Tekrar Deneyiniz");
            userPin = sc.nextInt();
        }
        System.out.println("Başarıyla giriş yapıldı.");
    }
}
