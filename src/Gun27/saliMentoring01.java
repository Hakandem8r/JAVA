package Gun27;

public class saliMentoring01 {
    public static void main(String[] args) {
        /*
     int array[][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
      verilen Array icinde
    --> kac tane rakam oldugunu return eden  methodu yazdiriniz
     */
        System.out.println("Arrayde kaç sayı var = " + array());

    }

    public static int array() {
        int array[][] = {{7, 12, 97, 23}, {543, 23, 675}, {2}, {2, 33, 6, 3, 7}};

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                counter++;

            }
        }

        return counter;

    }
}

