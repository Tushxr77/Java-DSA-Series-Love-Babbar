package OOPS;

public class PolyMorphism {
    public static class Lion{
        void speak(){
            System.out.println("Roar");
        }

    }
    public static class Dog{
        void speak(){
            System.out.println("Barking");
        }

    }
    public static class Cat{
        void speak(){
        System.out.println("Meow");
    }

    }
    public static class Human{
        void speak(){
            System.out.println("Talking");
        }

    }public static void main (String[] args){
        Lion l= new Lion();
        Dog d = new Dog();
        Human h = new Human();
        Cat c  = new Cat();

        l.speak();
        d.speak();
        h.speak();
        c.speak();

    }

}
