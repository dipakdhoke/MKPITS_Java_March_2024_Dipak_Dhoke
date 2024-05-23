package interfaceimpliment;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.makeSound();

        Animal bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.makeSound();
    }
}
