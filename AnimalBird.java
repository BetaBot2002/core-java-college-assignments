interface Flyable {
    void fly();
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();
}

class Bird extends Animal implements Flyable {
    String color;

    Bird(String name, String color) {
        super(name);
        this.color = color;
    }

    void makeSound() {
        System.out.println(name + " chirps");
    }

    public void showColor() {
        System.out.println(name + " is " + color);
    }

    public void fly() {
        System.out.println(name + " is Flying");
    }
}

class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Parrot", "Green");
        bird.makeSound();
        bird.fly();
        bird.showColor();
    }
}