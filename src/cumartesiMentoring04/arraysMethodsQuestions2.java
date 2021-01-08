package cumartesiMentoring04;

import java.util.Arrays;

public class arraysMethodsQuestions2 {
    public static void main(String[] args) {
        /*
İnt array oluşturunuz ve eleman sayısı 5 olsun.
Elemanlar random atansın. (10 a kadar - 10 dahil)

Array'i yazdırınız.     array = [......]

Daha sonra Array'daki maximum değeri bulunuz ve yazdırınız.

ÖRN:
array[2,5,33,67,3]

maximum değer =67
 */

        int [] a = new int[5];

        for (int i=0; i < a.length; i++){
            a[i]=(int) (Math.random()*10+1);
        }
        System.out.println("Arrays: " + Arrays.toString(a));

        int max = 0;

        for (int b=0; b < a.length; b++){
            if (a[b] > max){
                max=a[b];
            }
        }
        System.out.println("Maksimum değer: "+ max);
    }
}
