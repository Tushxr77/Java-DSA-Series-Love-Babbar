package OOPS;

class Student {
    String name;
    private int id;
    double cgpa;

    public void print() { // getter
        System.out.println(name + " " + id + " " + cgpa);
    }

    int getId() { // getter
        return id;
    }

    void setId(int x) { // setter
        id = x;
    }
}

public class PrivateKeyword {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.cgpa = 7.2;
        s1.name = "Tushar";

        // s1.id = 21; // Cannot access private variable directly

        s1.setId(15); // setter

        System.out.println(s1.getId()); // getter
    }
}
