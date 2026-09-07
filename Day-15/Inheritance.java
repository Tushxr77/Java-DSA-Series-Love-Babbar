package OOPS;

class pokemon {
    int power;
    String type;

    pokemon(String type, int power) {
        this.power = power;
        this.type = type;
    }

    void print() {
        System.out.println(this.power + " " + this.type);
    }

    pokemon() {
    }
}   // pokemon class ends here


class Legendarypokemon extends pokemon {
    String ability;
}


public class inheritance {
    public static void main(String[] args) {

        Legendarypokemon l1 = new Legendarypokemon();

        l1.power = 100;
        l1.type = "Fire";
        l1.ability = "Flame";

        l1.print();
        System.out.println(l1.ability);
    }
}
