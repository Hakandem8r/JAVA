package Gun54.Tasks.task1;

//Bir Interface bir başka Interface'den mirasını aldık yani extend ettik
public interface IElectric extends IVehicle{
    final static int batteryLife=100;

    String changeBattery();
//Soyut yani süslü parantezli kısmı olmayan
//yani gövdesi olmayan
//sadece adı ve parametreleri olan metodlara
//Abstract Metod denir.

//Interface'lerde sadece aşağıdaki 2 şekilde
//gövdeli metod kullanılabilir.

    //default belirteciyle, implemente zorunlu değil
    default void print() {
        System.out.println("default belirteciyşe metod yazılabilir");
    }

    //veya static şekilde
    static void autoPilot(){
        System.out.println("otonom sürüş modu.");
        }
    }

