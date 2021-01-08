package Gun43.JavaException;

import java.util.Scanner;

public class _05_JavaTryCatch {
    public static void main(String[] args) {
        String str = "";
        int a=5;
        int b=0;
        int c=0;

        try {
            System.out.println("1.Adım");
            char ilkHarf = str.charAt(0); // burda hata oluştu.. str="" olduğunda
            System.out.println("2.Adım");
            c=a/b;
            System.out.println("3.Adım");

        }
        catch (StringIndexOutOfBoundsException ex) //burada özel hata ismi yazılırsa;
        //ilgili hata gelirse catch kısmı çalışır.
        //ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığundan program kırılır
        {
            //ex.printStackTrace();
            System.out.println("4.Adım");
            System.out.println("Hata: String dizisinin sınırı aşıldı.");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Aritmetik hata oluştu");
        }
        catch(Exception ex) //hangi hata olursa olsun hata olduğunda Exception catch çalışır
        {
            System.out.println("Genel hata oluştu");
        }

        System.out.println("5.Adım");
    }
}
