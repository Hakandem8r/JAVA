package Gun13;

import java.util.Scanner;

public class ifInIf {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Ders notu giriniz: ");
        int not = oku.nextInt();

        if (not >= 90) {
            System.out.println("A");
        }else if (not >= 80) {
            System.out.println("B");
        }else if (not >= 70) {
            System.out.println("C");
        }else if (not >= 60) {
            System.out.println("D");
        }else if (not >= 40) {
            System.out.println("E");
        }else{
            System.out.println("F");
        }
        System.out.println("...................................................................");


    }
}
