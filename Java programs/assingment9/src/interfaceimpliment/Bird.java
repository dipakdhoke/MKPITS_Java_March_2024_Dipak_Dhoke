package interfaceimpliment;



class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }
}