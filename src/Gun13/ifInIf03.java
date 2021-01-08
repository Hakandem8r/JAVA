package Gun13;

import java.util.Scanner;

public class ifInIf03 {
    public static void main(String[] args) {
        //katsayıları verilen 2 bilinmeyenli denklemin köklerini bulun!
        // ax^2 + bx + c;
        //ÇÖZÜM ADIMLARI
        // kullanıcıdan a, b, c'yi okutun.
        // Delta = b*b - 4*a*c
        // Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2*a), x2= (-b - kök(d)) / (2*a)
        // Delta = 0 => 1 tane kök vardır x = -b/2a
        // Delta < 0 ise kök yoktur
        Scanner oku = new Scanner(System.in);
        System.out.print("a yı gir =");
        int a=oku.nextInt();
        System.out.print("b yı gir =");
        int b=oku.nextInt();
        System.out.print("c yı gir =");
        int c=oku.nextInt();
        double delta =b*b-(4*a*c);

        if (delta>0) {
            System.out.println("x1: " + ((-b + Math.sqrt(delta)) / 2));
            System.out.println("x2: " + ((-b - Math.sqrt(delta)) / 2));
        }
        else if (delta==0){
            System.out.println("x: "+(-b)/(2*a));
        }
        else if (delta<0){
            System.out.println("kok yoktur");
    }
}}
