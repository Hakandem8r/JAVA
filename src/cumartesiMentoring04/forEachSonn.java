package cumartesiMentoring04;

import java.util.Scanner;

public class forEachSonn {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bir atasözü giriniz: ");

        String atasozu = sc.nextLine();

        String[] kelime = atasozu.split(" ");

        for (String eleman : kelime){
            System.out.println(eleman);
        }
    }
}
