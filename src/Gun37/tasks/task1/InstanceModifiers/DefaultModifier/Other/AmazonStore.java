package Gun37.tasks.task1.InstanceModifiers.DefaultModifier.Other;

import Gun37.tasks.task1.InstanceModifiers.DefaultModifier.Same.Book;

public class AmazonStore {
    public static void main(String[] args) {
        Book kitap1=new Book(); //default olduğundan
        //diğer paketten ulaşılamaz

        Book kitap2=new Book("Yağmur");
        //Bu constructor'a ulaşabildim çünkü public
    }
}
