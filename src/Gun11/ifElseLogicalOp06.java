package Gun11;

import java.util.Scanner;

public class ifElseLogicalOp06 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir şifre giriniz: ");
        String sifre = oku.nextLine();

        if(sifre.length()>=8 && !sifre.contains("pass") && sifre.length()<=12){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
