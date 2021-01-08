package Gun11;

import java.util.Scanner;

public class javaLogicalOperators {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir string giriniz: ");
        String str = oku.nextLine();

        if(str.contains("study")){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
