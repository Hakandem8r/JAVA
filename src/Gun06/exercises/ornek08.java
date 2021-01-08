package Gun06.exercises;

import java.util.Scanner;

public class ornek08 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Username = ");
        String username=scan.nextLine();

        System.out.print("Pasword = ");
        int password=scan.nextInt();

        scan.nextLine();
        System.out.print("Secret question = ");
        String question=scan.nextLine();

        System.out.print("Username: "+username+"\nPassword: "+password+
                "\nSecret Question: "+ question);


    }
}
