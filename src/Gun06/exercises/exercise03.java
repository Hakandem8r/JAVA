package Gun06.exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class exercise03 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Cadde = ");
        String street=input.nextLine();
        System.out.print("Sokak = ");
        String sokak=input.nextLine();

        Scanner input1=new Scanner(System.in);
        System.out.print("Posta kodu = ");
        int pk=input1.nextInt();

        System.out.print("Ülke = ");
        String country=input.nextLine();
        System.out.print("Cadde = "+ street+ "\nsokak = "+ sokak+ "\npk = "+ pk+
                "\nÜlke= "+ country);
    }
}
