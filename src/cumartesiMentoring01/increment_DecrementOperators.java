package cumartesiMentoring01;

import java.util.Scanner;

public class increment_DecrementOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 1;
        System.out.println("++a = " + ++a);

        System.out.println("................................................ ");
        int b = 2;
        System.out.println("--b = " + --b);
        System.out.println("................................................ ");

        int apple = 20;
        int birne = 15;
        System.out.println(++apple + --birne);

    }
}
