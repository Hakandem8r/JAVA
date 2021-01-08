package Gun22;

public class javaMethods02 {
    public static class JavaMethods2 {
        public static void main(String[] args) {
            merhabaYaz();

            //System.out.println("ismet");
            ismeMerhabaYaz("ismet");
            ismeMerhabaYaz("Ayşe");
        }

        public static void merhabaYaz()
        {
            System.out.println("Merhaba ");
        }

        public static void ismeMerhabaYaz(String ad)
        {
            System.out.println("Merhaba "+ad);
        }
    }
}
