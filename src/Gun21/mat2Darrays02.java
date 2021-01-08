package Gun21;

public class mat2Darrays02 {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

        // int [][] mat=new int[4][3];
        int[][] mat = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        int max = 0;
        for (int i = 0; i < 4; i++) { //çünkü 4 satır var
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] > max) {
                    max = mat[i][j];
                }
            }

        }
        System.out.println("max= " + max);
    }
}
