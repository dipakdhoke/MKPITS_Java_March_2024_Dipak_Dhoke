package calculation;

public class Main {
    public static void main(String[] args) {
        int n=5;
        int b=7;
        calculate cal =new calculate() {

            @Override
            public int cal(int n, int b) {
              return n+b;
            }
        };
        calculate cal2 =new calculate() {
            @Override
            public int cal(int n, int b) {
                return n-b;
            }
        };
        calculate cal3 =new calculate() {
            @Override
            public int cal(int n, int b) {
                return n*b;
            }
        };
        calculate cal4 =new calculate() {
            @Override
            public int cal(int n, int b) {
                return n/b;
            }
        };



    }
}
