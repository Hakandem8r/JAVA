package Gun16ForLoop;

import java.util.Scanner;

public class forLoop03 {
    public static void main(String[] args) {
        //Kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = sc.nextInt();
        int toplam = 0;
        for(int i=1; i<sayi; i++){
            toplam=toplam+i;       // toplam+=i;

        }
        System.out.println("Toplam = " + toplam);

    }
}
