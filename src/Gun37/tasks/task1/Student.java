package Gun37.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxHour;
    ArrayList<Lesson> StudentLessons=new ArrayList<>();


    public static Student createStudent(String name, int maxHour)
    {

        Student std=new Student();
        std.name=name;
        std.maxHour=maxHour;

        return std;
    }

    public void LessonAdd(Lesson ders)
    {
        int totalHours=0;
        for (Lesson aldigiDers : StudentLessons){
            totalHours +=aldigiDers.hour;
        }
        if (totalHours + ders.hour < maxHour){
            StudentLessons.add(ders);
        }else{
            System.out.println("Max saati aştınız. Ders eklenemez");
        }
    }
}
