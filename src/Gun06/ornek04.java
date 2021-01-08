package Gun06;

import java.util.Scanner;

public class ornek04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Boy = ");
        double boy = scanner.nextDouble();

        System.out.print("Kilo = ");
        double kilo = scanner.nextDouble();

        System.out.println("Boyunuz ve " + "Kilonuz = "+ boy +", "+kilo);

    }
}
