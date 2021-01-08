package Gun38.nonAccesModifier.finalModifier.example2;

public class Person {
    String name;
    final int fingerprintCode;

    public Person(String name, int fingerprintCode) {
        this.name = name;
        this.fingerprintCode = fingerprintCode;
    }

    //final değişkenlerine ilk değer atama işlemi direk yapılabildiği gibi constructor'la da
    //atanabilir. Ancak daha sonra yine değeri değiştirilemez. Bu işlem ilk değer atama için
    // geçerli.


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fingerprintCode=" + fingerprintCode +
                '}';
    }
}
