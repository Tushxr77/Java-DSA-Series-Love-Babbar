package OOPS;

class Cricketers {
    // final String country = "India";
    static String country = "NZ";

    int run;
    String name;
    double avg;
}

public class FinalStatic {

    public static void main(String[] args) {

        // Final
        // Cricketers c1 = new Cricketers();
        // c1.run = 76;
        // c1.country = "Pakistan"; // Error: Cannot be changed
        // System.out.println(c1.country);

        // Static
        Cricketers c1 = new Cricketers();
        c1.country = "India";

        Cricketers c2 = new Cricketers();
        System.out.println(c2.country);

        // Prints India because static variables share
        // the same memory among all objects of the class.
    }
}
