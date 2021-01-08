package Gun11;

import java.util.Scanner;

public class ifElseLogicalOp07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zaman giriniz: ");
        int time = sc.nextInt();

        if(time<=2){
            System.out.println("Preis: 5 Euro");
        }else if(time<=5){
            System.out.println("Preis: 10 E");
        }else{
            System.out.println("Preis: 15 E");
        }
    }
}
