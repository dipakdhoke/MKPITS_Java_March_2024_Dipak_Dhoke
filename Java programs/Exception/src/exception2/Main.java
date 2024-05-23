package exception2;

public class Main {
    public static void main(String[] args) {
        TestCustomException1 invald = new TestCustomException1();
            try {
                invald.agedis(440);
            } catch (invalidage e) {
//                throw new RuntimeException(e);
                System.out.println(e.getMessage());
            }
        }
    }
