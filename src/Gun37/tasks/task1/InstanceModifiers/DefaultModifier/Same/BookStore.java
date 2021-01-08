package Gun37.tasks.task1.InstanceModifiers.DefaultModifier.Same;

public class BookStore {
    public static void main(String[] args) {

        //Aynı paketin içinde olduğundan defaulta ulaşabildik
        Book kitap1 = new Book();
        kitap1.name="Lord of the Rings";

        //Zaten public olduğundan sınır yoktu
        Book kitap2=new Book("Kar");
    }
}