package cumartesiMentoring25Temmuz.BurakTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Kodumuz başlatılıyor...");

        int sayi=0;
        int[] arr=new int[3];

        try{
  //          sayi=2;
   //         arr[4]=10;
            sc.nextInt();

        } catch (ArrayIndexOutOfBoundsException bolmeHata){
            System.out.println(bolmeHata.getMessage());
        } catch (InputMismatchException scannerHatasi){
            System.out.println(scannerHatasi.toString());
        }

        System.out.println("Kodumuz bitiriliyor...");
    }
}
