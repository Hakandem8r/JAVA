package Gun37.tasks.task1.InstanceModifiers.PrivateModifier.Same;

public class Person {
    int id;
    String name;
    String username;
    String password;

    public void SifreBelirle(String sifre) {
        if (sifre.length() >= 8) {
            this.password = sifre;
        } else {
            System.out.println("en az 8 karakter olmalı");
        }
    }

    public void SifreGoster()
    {
        if (this.password != null) {
            System.out.println("****" + this.password.substring(4));
        }

    }
}
