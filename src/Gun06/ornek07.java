package Gun06;

import java.util.Scanner;

public class ornek07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username = ");
        String user = scanner.nextLine();

        Scanner read = new Scanner(System.in);
        System.out.print("Password= ");
        int password = scanner.nextInt();

        System.out.print("Gizli soru= ");
        String giz = scanner.nextLine();
    }
}

