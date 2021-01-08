package Gun12;

import java.util.Scanner;

public class dununSorusu02 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("x değeri: ");
        int x = oku.nextInt();

        System.out.print("y değeri: ");
        int y = oku.nextInt();

        if (x < -2 || x > 8 || y > 4 || y < 1){
            System.out.println("Dışında");
        }else if(y < 4 && y > 1 && x < 8 && x > -2){
            System.out.println("İçinde");
        }else{
            System.out.println("Çizgi üzerinde");
        }
    }
}
