package Gun18;

public class arrays02 {
    public static void main(String[] args) {
        int sayi;
        int[] dizi1 = new int[5];
        System.out.println("dizi1.length = " + dizi1.length);
        
        for(int i=0; i<dizi1.length; i++){
            System.out.println("Dizinin "+ i+". Elemanı= " + dizi1[i]);
        }
        System.out.println("dizi1[4] = " + dizi1[4]);
    }
}
