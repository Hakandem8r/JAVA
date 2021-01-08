package Gun08;

public class replaceAll {
    public static void main(String[] args) {
        // ReplaceAll: replace gibi çalışır farkı kritere göre değiştirir!

        String text = "Merhaba Dünya";

        System.out.println("orjinal = " + text);
        System.out.println("a, b, n leri * a çevirme = " + text.replaceAll("[abn]", "*"));
        System.out.println("Büyük harfleri @ yapılmış hali = " + text.replaceAll("[A-Z]", "@"));
        text.replaceAll("[A-Z]", "x").replaceAll("[a-z]", "x");

        System.out.println(".................");
        System.out.println("text.replaceAll(\"[a]\",\"o\") = " + text.replaceAll("[a]","o"));
    }
}
