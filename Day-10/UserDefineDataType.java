package OOPS;
import java.util.Scanner;
public class UserDefineDataType {
    public static class Student{
        int id ;
        String name;
        double cgpa;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(); //Declartion
        s1.name = "Tushar";
        s1.id = 15;
        s1.cgpa = 7.7;
        //Asking for the input

        Student s2 = new Student(); //Declartion
        s2.name = "Harsh";
        System.out.println("Ask For The Detials");
        s2.id = sc.nextInt();
        s2.cgpa = 7.6;

        Student s3 = new Student(); //Declartion
        s3.name = "Luckey";
        s3.id = 19;
        s3.cgpa = 8.7;

        System.out.println(s1.name + " " +s1.id+ " " + s1.cgpa);
        s2.cgpa = 9.8;//updation
        System.out.println(s2.cgpa);

        //Asking from the user
        System.out.println(s2.id);
    }
}
