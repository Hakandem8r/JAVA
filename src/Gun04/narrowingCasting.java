package Gun04;

public class narrowingCasting {
    public static void main(String[] args) {
        // byte -> short -> char -> int -> long -> float -> double ; manuel dönüşüm
        double vergi = 6.256;
        int yuvarlanmisVergi = (int) vergi;

        System.out.println("yuvarlanmisVergi = " + yuvarlanmisVergi);
    }
}
