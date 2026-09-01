public class StudentAttributes {
    public static void main(String[] args) throws Exception {

        // Default Constructor
//        OOPS A = new OOPS();
//        A.id = 1;
//        A.name = "Tushar";
//        A.age = 18;
//        A.nos = 5;
//
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.study();
//        A.bunk();
//        A.sleep();

        // Parameterized Constructor
        OOPS A = new OOPS(1, 18, "Tushar", 65);

//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.study();
//        A.bunk();
//        A.sleep();

        // Copy Constructor
        OOPS B = new OOPS(A);

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);

        B.sleep();
    }
}
