package Gun06.exercises;

import java.util.Scanner;

public class exercise01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Boyunuz = ");
        double boy=scanner.nextDouble();

        System.out.print("Kilonuz = ");
        double kilo=scanner.nextDouble();

        System.out.print("Boyunuz = " + boy+ ", "+ "Kilonuz = " + kilo);
    }
}
