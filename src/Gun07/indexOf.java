package Gun07;

public class indexOf {
    public static void main(String[] args) {

        String text = "Good";

        System.out.println("G harfinin indexi = "+ text.indexOf("G")); //indexler sıfırdan başlar
        System.out.println("d harfinin indexi = "+ text.indexOf('d'));
        System.out.println("H harfinin indexi = "+ text.indexOf("H")); // -1 bulamadı,yok!
        System.out.println("od nin indexi = "+ text.indexOf("od"));
        System.out.println("...........................");
        String str = "Şiir";
        System.out.println("str.indexOf(\"r\") = " + str.indexOf("r"));

    }
}
