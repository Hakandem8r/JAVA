package Gun07.Exercises;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);

        System.out.print("Give a word: ");
        String word=scan.nextLine();

        System.out.println("The last word is "+ word.charAt(word.length()-4));

    }
}
