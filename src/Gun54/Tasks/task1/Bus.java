package Gun54.Tasks.task1;

public class Bus extends Vehicle implements IDiesel{

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000 km gider";
    }

    @Override
    public String drive() {
        return "Yavaş sür, yolcuları rahatsız etme";
    }
}
