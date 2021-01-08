package Gun09;

public class aritmeticOperations04 {
    public static void main(String[] args) {
        //artırma ve azaltma operatörü
        int a=5;
        int b=2;
        int k=0;

        a++; // a nın değerini 1 artır -> a=a+1'le aynı anlamda -> 6
        ++a; // a'nın değerni bir artır -> a=a+1'le aynı -> 7

        k = a++; // ++ lar sağda olduğu için önce k=a çalışır, sonra a=a+1 çalışır; k=7, a=8
        k = ++a; // ++ lar solda olduğu için önce a=a+1 çalışır, sonra k=a olur! a=9, k=9

        a--; // a nın değerini 1 azaltır => a=a-1'le aynı  -> 8
        --a; // a'nın değerni bir azaltır => a=a-1'le aynı -> 7

        k = a--; // -- lar sağda olduğu için önce k=a çalışır, sonra a=a-1 çalışır; k=7, a=6
        k = --a; // -- lar solda olduğu için önce a=a-1 çalışır, sonra k=a olur! a=5, k=5

    }
}
