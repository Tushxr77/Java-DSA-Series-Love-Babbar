package OOPS;

public class ThisKeyWord {

    public static class Pokemon {
        int power;
        String name;

        void print() {
            System.out.println(power + " " + name);
        }

        Pokemon(int p, String s) {
            this.power = p;
            this.name = s;
        }
    }

    public static void main(String[] args) {

        Pokemon p1 = new Pokemon(75, "Pikachu");
        p1.print();
    }
}
