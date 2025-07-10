// example of overriding in polymorphism in java
class Animal {
    void sound() {
        System.out.println("Makes a sound");
        }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Meows");
    }
}
public class polymorphism1{
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();
        a.sound();
        d.sound();
        c.sound();
    }
}