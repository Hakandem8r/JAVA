package Gun19;

import java.util.Scanner;

public class arrays02 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 5 adet meyve ismini bir diziye atadıktan sonra, elma ismi
        // geçen meyveleri ekrana yazdırınız.

        Scanner scan = new Scanner(System.in);
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Fruits: ");
            array[i] = scan.nextLine();
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i].equalsIgnoreCase("elma"))
                System.out.println(array[i]);
    }

}
}
