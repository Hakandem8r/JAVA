package cumartesiMentoring04;

import java.util.Arrays;

public class arrayMethods01 {
    public static void main(String[] args) {
        // TODO--Arrays.fill() metodu---arraydeki bütün elamanlar, belirtilen eleman ile doldurulur

        int[] list = {1,4,7,8,9,10};

        System.out.println("Arrayin ilk hali: " + Arrays.toString(list));
        Arrays.fill(list, 4);
        System.out.println("Arrayin son hali: " +Arrays.toString(list));

        System.out.println("................................");

        // değiştitilecek değerin, hangi aralıkta olduğunu belirleyebiliriz.
        Arrays.fill(list, 0, 4, 99);

        System.out.println("................................");

        //Arrayin elemanlarını küçükten büyüğe sıralamamızı sağlar:

        int[] b = {88, 77, 25, 66, 31, 22, 3};
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        System.out.println("................................");

        // belirli bir aralıkta küçükten büyüğe sıralamamızı sağlar:
        int[] b1 = {88, 77, 25, 66, 31, 22, 3};
        System.out.println("İlk hal: "+ Arrays.toString(b1));
        Arrays.sort(b1, 0, 4);
        System.out.println("Son hal: "+ Arrays.toString(b1));


        String[] dizi = {"x", "q", "u", "a", };
    }
}
