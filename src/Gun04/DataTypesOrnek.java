package Gun04;

public class DataTypesOrnek {
    public static void main(String[] args) {
        byte byteDeger = 127;
        short shortDeger = 32000;
        int intDeger = 5;
        long longDeger = 6; // l konulabilir ama zorunlu değil

        float floatDeger = 5.4f; // f koyulmalı yoksa double dan ayırmaz!
        double doubleDeger = 6.2; // d konulabilir, zorunlu değil.

        char charDeger = 'A'; // char'da karakterler tek tırnakta yazılır!
        char charDeger2 = 65; // karakterler temelde sayı olduğundan sayı değeri de atanabilir.
                                // ekrana yazarken char tipi olduğundan harf olarak görünür.

        boolean booleanDeger = true; // true veya false değeri olur.

        System.out.println("byteDeger : " + byteDeger);
        System.out.println("shortDeger : " + shortDeger);
        System.out.println("intDeger : " + intDeger);
        System.out.println("longDeger : " + longDeger);
        System.out.println("floatDeger : " + floatDeger);
        System.out.println("doubleDeger : " + doubleDeger);
        System.out.println("charDeger : " + charDeger);
        System.out.println("charDeger2 : " + charDeger2);
        System.out.println("booleanDeger : " + booleanDeger);

    }
}
