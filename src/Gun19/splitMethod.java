package Gun19;

import java.util.Scanner;

public class splitMethod {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir cümle giriniz: ");
        String cumle = oku.nextLine();

        String[] kelimeler = cumle.split(" "); //boşluk karakterine göre böler
        // ve diziye atar

        // dizilerde length : dizi deki eleman sayısını verir.
        for (int i=0; i<kelimeler.length; i++){
            System.out.println(kelimeler[i]);
        }
        //2. yöntem foreach
        for(String elemanDegeri : kelimeler){
            System.out.println("elemanDegeri = " + elemanDegeri);
        }
}
}
