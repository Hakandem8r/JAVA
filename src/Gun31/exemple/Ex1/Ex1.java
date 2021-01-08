package Gun31.exemple.Ex1;

public class Ex1 {
// Ayrı bir dosyada student class'ı tanımlayınız; fields, name, grade

    public static void main(String[] args) {
        student ogrenci1=new student();

        ogrenci1.name="Ayşe";
        ogrenci1.grade=3;

       // 1.Yöntem
        School okulu=new School();
        okulu.adress="Göztepe";
        okulu.name="Marmara Üniversitesi";
        okulu.principalName="Rektör";
        okulu.tuitionFees=0;

        ogrenci1.schoolInfo=okulu;

        // 2.Yöntem
        ogrenci1.schoolInfo=new School();
        ogrenci1.schoolInfo.adress="Göztepe";
        ogrenci1.schoolInfo.name="Marmara Üniversitesi";
        ogrenci1.schoolInfo.principalName="Rektör";
        ogrenci1.schoolInfo.tuitionFees=0;


        System.out.println("ogrenci1.name = " + ogrenci1.name);
        System.out.println("ogrenci1.grade = " + ogrenci1.grade);
        System.out.println("ogrenci1.schoolInfo.name = " + ogrenci1.schoolInfo.name);

        student ogrenci2=new student();

    }
}
