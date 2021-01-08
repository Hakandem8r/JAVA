package Gun58.Ornek1;

public class Lahmacun implements IFood {

    public void dough(){
        System.out.println("kabardı");
    }
    public  void addMeat(){
        System.out.println("bol etli");
    }
    public void bake(){
        System.out.println("çıtır çıtır oldu");
    }
    @Override
    public void taste() {
        System.out.println("acılı");
    }

    @Override
    public double ucret() {
        return 3.0;
    }

    public void topping() {
    }
}
