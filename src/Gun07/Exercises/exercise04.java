package Gun07.Exercises;

public class exercise04 {
    public static void main(String[] args) {
        String str="Hello";

        System.out.println("is there llo: "+ str.contains("llo"));
        System.out.println("Is there o: "+ str.contains("o"));
        System.out.println("Is there O: "+ str.contains("O"));

        System.out.println("................................");

        String str1="Merhaba";
        System.out.println("Is it equal: "+ str1.equals("Merhaba"));
        System.out.println("Is it equals: "+ str1.equals("merhaba"));

        System.out.println("..........................................");

        String str2="Merhaba";
        System.out.println("Is it equal: "+ str2.equalsIgnoreCase("rhabA"));

        System.out.println(".....................................................");

        String text="Good";
        System.out.println("The index of d: "+ text.indexOf("g"));
        System.out.println("The index of h: "+ text.indexOf("h"));

    }
}
