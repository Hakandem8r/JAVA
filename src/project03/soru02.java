package project03;

import java.sql.SQLOutput;
import java.util.Arrays;

public class soru02 {
    /*Soru 2:
getPopulation:
      main de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
      countryNames Ülke isimleri
      countryPopulations Ülke nüfusları

    populationOfCountry adında bir metod yaznız.
    TODO => Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

    Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
    göndersin.

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000} */
    public static void main(String[] args) {

        String[] ulkeler = {"USA", "Mexico", "Canada"};
        int[] nufuslar = {100000, 120000, 130000};

        populationCountries(ulkeler, nufuslar, "USA");


    }

    public static void populationCountries(String [] ulkeler, int [] nufus, String ulkeAdi) {
        switch(ulkeAdi){
            case "USA": System.out.println("100000"); break;
            case "Mexico": System.out.println("120000"); break;
            case "Canada": System.out.println("130000"); break;
            default:
                System.out.println("-1");
        }

    }
}
