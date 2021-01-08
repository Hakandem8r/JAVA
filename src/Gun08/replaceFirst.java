package Gun08;

public class replaceFirst {
    public static void main(String[] args) {
        //ReplaceFirst : replace ile aynı vazife ama sadece ilk bulunanı değiştirir!

        String text = "Merhaba Dünya";

        System.out.println("The original text = " + text);
        System.out.println("bütün a ların değişmesi = " + text.replace('a', 'e'));
        System.out.println("İlk bulunan a nın değişmesi = " + text.replaceFirst("a", "e"));
    }
}
