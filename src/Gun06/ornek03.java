package Gun06;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class ornek03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("ilk sayı = ");
        int ilksayi = scanner.nextInt();

        System.out.print("ikinci sayı =");
        int ikinciSayi = scanner.nextInt();

        int toplam = ilksayi + ikinciSayi;

        System.out.print("toplam = " + toplam);

    }
}
