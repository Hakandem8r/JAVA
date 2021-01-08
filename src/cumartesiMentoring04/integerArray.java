package cumartesiMentoring04;

public class integerArray {
    public static void main(String[] args) {


    //TODO Integer Array indeki elemanları for each döngüsünde toplayınız:

    int[] SayiArrayi = {5, 8, 35, 90, 12};
    int toplam = 0;

    for(int yeniSayi : SayiArrayi){
        toplam += yeniSayi;
    }
        System.out.println(toplam);
}}
