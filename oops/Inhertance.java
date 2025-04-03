package oops;

public class Inhertance {
    public static void main(String[] args) {
        Dog dog = new  Dog();

        dog.walk();
        dog.eat();
        dog.color = "red";

        System.out.println(dog.color);
    }
}

class Animal+{
    String color;

   void eat(){
        System.out.println("Eating");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("walking dogs");
    }
}
