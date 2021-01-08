package Gun29;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void Ekleme(Map<String, Map<String,String>> users){

        Scanner oku=new Scanner(System.in);

        System.out.println("Name: ");
        String name=oku.nextLine();

        System.out.println("Username: ");
        String username=oku.nextLine();

        System.out.println("Password: ");
        String password=oku.nextLine();

        System.out.println("userType: ");
        String userTipi=oku.nextLine();

        Map<String,String> bilgilerMap=new HashMap<>();//burada bir kartvizit gibi Map'e atıldı
        bilgilerMap.put("password", password);
        bilgilerMap.put("userType", userTipi);
        bilgilerMap.put("name",name);

        users.put(username, bilgilerMap); //burada kullanıcının verdiği isme kartvizit gibi bilgiler atıldı
    }

    //Kullanıcıya 1-Ekleme, 2-Listeleme, 3-Arama, 4-Düzeltme, 5-Çıkış
    //seçenekleri vererek username, password ve userTip'ten 8Müdür, çalışan) oluşan bir Map tanımlayınız.
    //Kullancının seçimine göre her bir işlemi ayrı metoda yaptırınzı.
    //Main'de sadece seçenekler ve metodların çağrılması olsun.

    //Bölüm bölüm gidiyoruz, önce main'in içini tasarlayınız.
    
    public static void Listeleme(Map<String,Map<String,String>> users){
        System.out.println("users = " + users);
    }
    
    
    public static void main(String[] args) {
          //Username  password  loginCount
        Map<String,Map<String,String>> users=new HashMap<>();

        Scanner oku=new Scanner(System.in);
        int secim=0;
        do{

            System.out.println("**** Menü ****");
            System.out.println("1-Ekleme");
            System.out.println("2-Listeleme");
            System.out.println("3-Arama");//kullanıcıdan bir username alıp bunun bilgilerinin görüntülenmesi sağlanacak
            System.out.println("4-Düzeltme");//kullanıcıdan bir username alıp bunun bilgilerinin değiştirilmesi sağlanacak
            System.out.println("5-Çıkış");
            System.out.print("Seçiminiz= ");
            secim=oku.nextInt();

            switch(secim)
            {
                case 1: Ekleme(users);
                    break;
                case 2: Listeleme(users);
                    break;
                case 3: //Arama();
                    break;
                case 4: //Düzeltme();
                    break;
                case 5: //Cıkıs();
                    break;
            }

        }while(secim!=5);

    }
}
