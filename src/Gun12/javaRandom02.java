package Gun12;

import java.util.Scanner;

public class javaRandom02 {
    public static void main(String[] args) {
        // Kullanıcıdan alt ve üst değeri tek bir satırda arasında boşluk olarak (önce min bir boşluk
        // sonra mx değeri) alarak sayı üretiniz ve ekrana yazdırınız.
        // 34 56 şeklinde tek bir satırda girecek min ve max 1

        Scanner scan = new Scanner(System.in);
        System.out.print("aralikli  iki sayı giriniz: ");
        String min_max = scan.nextLine();

        String min = min_max.substring(0,min_max.indexOf(" "));
        String max = min_max.substring(min_max.indexOf(" ") + 1, min_max.length());

        int min1 = Integer.parseInt(min);
        int max1 = Integer.parseInt(max);

        int num = (int) ((Math.random() * ((max1 - min1) + 1)) + min1);
        System.out.println("num = " + num);



    }
}
