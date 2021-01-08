package Gun05;

public class ornek2 {
    public static void main(String[] args) {
        // short ve byte cinsinden 2 değer tanımla ve ata
        // short'u byte'a çevir; taşan ve taşmayan değerler vererek çıkan sonuçları değerlendir.

        short shortDeger = 5;
        short shortDeger1 = 7;
        byte donustur = (byte) shortDeger;
        byte donustur1 = (byte) shortDeger1;

        System.out.println("donustur1 = " + donustur1);
        System.out.println("donustur = " + donustur);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("shortDeger1 = " + shortDeger1);

    }
}
