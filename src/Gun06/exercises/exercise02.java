package Gun06.exercises;

import java.util.Scanner;

public class exercise02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Kaç bilet istersiniz? - ");
        byte ticket=input.nextByte();
        System.out.print("Sigorta ister misiniz? - ");
        boolean insurance=input.nextBoolean();
        System.out.print("Kaç bilet istersiniz? - "+ ticket+ " "+
                "\n Sigorta ister misniz? - "+ insurance);
    }
}
