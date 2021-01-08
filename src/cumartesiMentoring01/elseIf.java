package cumartesiMentoring01;

import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {
        /*                         todo      Else İf
        bir değişken birden fazla koşul alıyorsa else if kullanırız.
        Karışıklılığı önler.

        //İF KOŞULU YUKARIDAKİ KOSULLARIN SAGLANIP SAGLANMADIGINA BAKMIYOR. İF YAZDIGINIZ SÜRECE ÇALIŞIR.
        önce if koşuluna geliyor, eğer bu olmazsa bir aşagıdaki else if bloğuna gidiyor. Koşul sağlandığı blokta duruyor.

            */
        Scanner sc = new Scanner(System.in);
        System.out.println("Not gir = ");

        int not = sc.nextInt();
        if (not>90){
        System.out.println("AA");

    }else if(not>80){
            System.out.println("BB");
        }else if(not>70){
            System.out.println("CC");
        }else
            System.out.println("Dersten kaldınız!");

}}
