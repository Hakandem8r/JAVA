package Gun06;

import com.sun.source.util.DocTreePathScanner;

import java.util.Scanner;

public class ornek02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Adınızı giriniz = ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınızı giriniz = ");
        String soyad = scanner.nextLine();
        System.out.println("Ad soyad = "+ ad + " "+soyad);

    }
}
