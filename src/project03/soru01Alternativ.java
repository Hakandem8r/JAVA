package project03;

public class soru01Alternativ {
    //   Soru 1:
//        CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
//        büyük harfe çevirip geri döndüren metodun yazınız.
//
//                Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel


    public static String camelcase(String cumle) {
        String[] dizi = cumle.split(" ");
        for (int i = 0; i < dizi.length; i++) {

            int ch = dizi[i].charAt(0);
            dizi[i] = (char) (ch - 32) + dizi[i].substring(1);

        }
        String yeni = "";
        for (int i = 0; i < dizi.length; i++) {
            yeni += dizi[i] + " ";
        }

        return yeni;
    }
    public static void main(String[] args) {
        String mesaj = "bugün hava çok güzel";
        System.out.println(camelcase(mesaj));

    }
}
