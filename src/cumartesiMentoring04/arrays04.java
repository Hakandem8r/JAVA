package cumartesiMentoring04;

import java.util.Scanner;

public class arrays04 {
    public static void main(String[] args) {
        //TODO Scanner ile Array elemanlarını girme:

        Scanner sc = new Scanner(System.in);

        int[] elma = new int[5];
        int toplam = 0;

        //TODO--------Array'in değerlerimi girme--------------
        System.out.println("Array elemanlarını giriniz: ");
        for (int i=0; i< elma.length;i++){
            elma[i] = sc.nextInt();
        }

        // TODO ---- Array'in değerlerini yazdırma--------------
        System.out.println("Array'in değerleri yazdırılıyor: ");
        for (int i=0; i < elma.length; i++){
            System.out.println("Eleman: "+ elma[i]);
        }

        //TODO -----Array in değerlerinin ortalamasını alma--------
        for (int i=0; i<elma.length; i++){
            toplam = toplam+elma[i];
        }
        int ortalama = toplam / elma.length;
        System.out.println("Array elemanlarının ortalaması = " + ortalama);
    }
}
