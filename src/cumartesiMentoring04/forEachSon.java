package cumartesiMentoring04;

public class forEachSon {
    public static void main(String[] args) {


        String[] StringArrayi = {"Alpha", "Beta", "Gamma", "Delta"};

        System.out.println("For Loop: ");
        for(int i=0; i < StringArrayi.length; i++){
            System.out.println(StringArrayi[i]);
        }
        System.out.println("\nFor each Loop: ");


        for(String str : StringArrayi){
            System.out.println("str = " + str);
        }
    }
}
