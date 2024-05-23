package Vehicle2;

public class TwoWheeler extends Car implements Cycle,MotorBike {


    TwoWheeler(String name) {
        super(name);
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void distance() {
        System.out.println("50 meter");
    }

    @Override
    public void speed() {
        System.out.println("90km/hr");

    }
}
