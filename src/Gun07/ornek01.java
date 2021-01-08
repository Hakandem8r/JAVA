package Gun07;

import java.util.Scanner;

public class ornek01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Word = ");
        String kelime=input.nextLine();
        System.out.print("The last word = "+ kelime.charAt(kelime.length()-1));


    }
}
