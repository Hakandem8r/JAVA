package cumaMentoring01;

import java.util.Scanner;

public class method03 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade=scan.nextInt();
        grades(grade);
    }


    public static void grades(int grade){
        if(grade>=85){
            System.out.println("Perfect");
        }else if(grade>=70){
            System.out.println("Good");
        }else if(grade>=60){
            System.out.println("Normal");
        }else if(grade>=45){
            System.out.println("Not bad");
        }else{
            System.out.println("Bad");
        }
    }
}
