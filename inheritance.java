class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting Animal
class Dog extends Animal{

    void bark() {
        System.out.println("Dog barks");
    }
}

public class inheritance {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.bark();
    }
}

