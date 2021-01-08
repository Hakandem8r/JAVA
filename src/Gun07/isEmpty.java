package Gun07;

public class isEmpty {
    public static void main(String[] args) {
        // String boş mu değil mi onu kontrol ediyor, sonuç true / false

        String str = "Hi";

        System.out.println("str1 içi boş mu = "+ str.isEmpty());

        String str2 = "";
        System.out.println("str2 içi boş mu = " + str2.isEmpty());

        String str3 = "  ";
        System.out.println("str3 içi boş mu = "+ str3.isEmpty());
    }
}
