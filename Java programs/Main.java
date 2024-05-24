package vehiclerent;

public class Main {
    public static void main(String[] args) {
        Rentable car =new Rentable() {
            @Override
            public double calculateRent(double rateperday, double rentdays) {
                return rateperday*rentdays;
            }

            @Override
            public void displayDetails(String name) {
             System.out.println("brand is:"+name);
            }
        };
        Rentable bike =new Rentable() {
            @Override
            public double calculateRent(double rateperday, double rentdays) {
                return rateperday*rentdays;
            }

            @Override
            public void displayDetails(String name) {
                System.out.println("brand is:"+name);
            }
        };
        Rentable truck =new Rentable() {
            @Override
            public double calculateRent(double rateperday, double rentdays) {
                return rateperday*rentdays;
            }

            @Override
            public void displayDetails(String name) {
                System.out.println("brand is:"+name);
            }
        };
    }
}
