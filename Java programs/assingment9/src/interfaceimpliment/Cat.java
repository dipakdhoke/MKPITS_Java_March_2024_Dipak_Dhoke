package interfaceimpliment;

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is meowing");
    }
}
