public class OOPS {

    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Default Constructor
    public OOPS() {
        System.out.println("OOPS Default Constructor Called");
    }

    // Parameterized Constructor
    public OOPS(int id, int age, String name, int nos) {
        System.out.println("OOPS Parameterized Constructor Called");

        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
    }

    // Copy Constructor
    public OOPS(OOPS srcobj) {
        System.out.println("OOPS Copy Constructor Called");

        this.id = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
        this.nos = srcobj.nos;
    }

    // Methods / Behaviors
    public void study() {
        System.out.println(name + " studying");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }
}
