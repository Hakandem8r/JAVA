package Gun58.Ornek1;

public class Borsh implements IFood {
    void boil(){
        System.out.println("iyice kaynadı");
    }
    void eatTomorrow(){
        System.out.println("Bugün yerim! Hak, Kerim yarına");
    }
    @Override
    public void taste() {
        System.out.println("sulu, ekşi");
    }

    @Override
    public double ucret() {
        return 3.0;
    }
}
