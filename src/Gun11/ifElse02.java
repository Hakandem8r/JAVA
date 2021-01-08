package Gun11;

import java.util.Scanner;

public class ifElse02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Vize notu giriniz: ");
        double vize = scr.nextDouble();
        System.out.print("Final notu giriniz: ");
        double fin = scr.nextDouble();
        double average = (vize*0.40)+(fin*0.60);



        if(average>=60){
            System.out.println("Geçtiniz");
        }else{
            System.out.println("Kaldınız");
        }




    }
}
