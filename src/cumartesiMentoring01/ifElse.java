package cumartesiMentoring01;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir sayı giriniz = ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Sayı çifttir");
        }else{
            System.out.println("Sayı tektir");
        }
    }
}
