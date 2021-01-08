package Gun08;

public class replace {
    public static void main(String[] args) {
        // Replace: Bir Stringin içindeki karakter(ler)i
        // verilen yenisi ile değiştirir

        String text = "Merhaba Dünya";

        System.out.println("orjinal hali = " + text);
        System.out.println("a'ların e olarak değiştirilmiş = " + text.replace('a', 'e'));
        System.out.println("ba -> de hali = " + text.replace("ba", "de"));
        System.out.println("Dünya -> Java değiştirilmiş hali = " + text.replace("Dünya", "Java"));
        System.out.println(".............................");
        System.out.println(text.replace("M", "W"));
    }
}
