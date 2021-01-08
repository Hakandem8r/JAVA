package Gun12;

public class javaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 2;

        //abs --> mutlak değeri verir.
        System.out.println("a nın mutlak değeri = " + Math.abs(a)); // 12
        System.out.println("a ve b den büyük olanı = " + Math.max(a,b));
        System.out.println("a ve b den büyük olanı = " + Math.max(-2,4));
        System.out.println("a ve b den küçük olanı = " + Math.min(-2,4));
        System.out.println("16'nın karekökü = " + Math.sqrt(16)); // sqrt -> karekökü bulma
        System.out.println("2 nin üçüncü kuvveti = " + Math.pow(2,3)); // 8 -> 2 üzeri 3
        System.out.println("round of 3.1 = " + Math.round(3.1)); // 3
        System.out.println("round 3.5 = " + Math.round(3.5)); // 4
        System.out.println("ceil of 3.1 = " + Math.ceil(3.1)); //4
        System.out.println("ceil of 3.5 = " + Math.ceil(3.5)); //4
        System.out.println("floor of 3.1 = " + Math.floor(3.1)); // 3
        System.out.println("floor of 3.5 = " + Math.floor(3.5)); // 3

    }
}
