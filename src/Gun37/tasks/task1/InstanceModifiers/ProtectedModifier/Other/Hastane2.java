package Gun37.tasks.task1.InstanceModifiers.ProtectedModifier.Other;

import Gun37.tasks.task1.InstanceModifiers.ProtectedModifier.Same.Doktor;

public class Hastane2 {
    public static void main(String[] args) {
        //protected olduğunda default gibi
        // diğer paketlerden kullanılamıyor.
        //Doktor dr3=new Doktor();

        // bu erişim public olduğundan kullanılabildi.
        Doktor dr4=new Doktor("Ömer");

        // erişim belirteci protected olduğundan kullanılamaz.
        //dr4.print();

    }
}
