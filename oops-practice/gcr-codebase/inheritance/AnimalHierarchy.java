package inheritance;
class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void makesound() {
        System.out.println(name + " makes a sound");
    }
}

// Dog subclass
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age); // call parent constructor
    }

    @Override
    void makesound() {
        System.out.println(name + " barks");
    }
}

// Cat subclass
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makesound() {
        System.out.println(name + " meows");
    }
}

// Bird subclass
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makesound() {
        System.out.println(name + " Chi-Chi");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a;

        a = new Dog("tony", 3);
        a.makesound();

        a = new Cat("Kitty", 2);
        a.makesound();

        a = new Bird("Parrot", 1);
        a.makesound();
    }
}
