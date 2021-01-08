package Gun28;


import java.util.*;

public class exrcise {
    public static void main(String[] args) {
      
        Map<String, String> userMap=new HashMap<>();
        userMap.put("e-mail", "ava@hlbljl");
        userMap.put("name", "Ahmet Exemple");
        userMap.put("Adres", "Berlin...");
        userMap.put("Handy", "15484121548742");
        System.out.println("userMap = " + userMap);
        System.out.println();
        
        for (Map.Entry<String, String> bilgiler:userMap.entrySet()){
            System.out.println("bilgiler = " + bilgiler);
        }
    }
}
