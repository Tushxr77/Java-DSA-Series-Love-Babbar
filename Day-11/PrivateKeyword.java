package OOPS;
class Student {
    String name;
    private int id; 
    double cgpa;
    public void print(){
        System.out.println(name+" "+id+" "+cgpa);
    }
}
public class PrivateKeyword {


    public static void main (String[] args){
        Student s1 = new Student();
        s1.print();
        s1.cgpa =7.2;
        s1.name = "Tushar";
       //s1.id = 21;
        s1.print();
    }
}
