package Gun13;

import java.util.Scanner;

public class replaceIleCozum {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Fizik: 90 şeklinde gir:");
        String str = oku.nextLine();

        int not = Integer.parseInt(str.replaceAll("[^0-9]",""));
        System.out.println(not);

        if (not >= 90) {
            System.out.println("A");
        }
        else if (not >= 80){
            System.out.println("B");
        }
        else if (not >= 70) {
            System.out.println("C");
        }
        else if (not >= 60) {
            System.out.println("D");
        }
        else if (not >= 40) {
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }

    }
}

