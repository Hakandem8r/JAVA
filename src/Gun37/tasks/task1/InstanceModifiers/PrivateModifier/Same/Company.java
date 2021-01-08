package Gun37.tasks.task1.InstanceModifiers.PrivateModifier.Same;

public class Company {
    public static void main(String[] args) {
        Person personel=new Person();
        personel.id=1;
        personel.name="Ahmet";
        personel.username="ahmet";
        //personel.password="1234";
        //burası private olduğundan direkt erişilemez

        personel.SifreBelirle("1234abcd");
        personel.SifreGoster();
    }
}
