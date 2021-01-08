package Gun34.Tasks.task1;

public class Lesson {
    String name;
    int hour;

//todo => return yoksa void varsa tipi yazılır
    public static Lesson createLesson(String name, int hour){
        Lesson ders=new Lesson();
        ders.name=name;
        ders.hour=hour;

        return ders;
    }
}