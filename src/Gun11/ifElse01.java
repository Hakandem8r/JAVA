package Gun11;

import java.util.Scanner;

public class ifElse01 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Notu giriniz: ");
        int ogrNot = oku.nextInt();

     /*   if(ogrNot >= 50){
            System.out.println("Geçtiniz.");
        }
        if(ogrNot<50){
            System.out.println("Kaldınız.");
        }
        */
        if(ogrNot>=50){
            System.out.println("Geçtiniz.");
        }else
        if(ogrNot<50){
            System.out.println("Kaldınız.");
        }
    }
}
