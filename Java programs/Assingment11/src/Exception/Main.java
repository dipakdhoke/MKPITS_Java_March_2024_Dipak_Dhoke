package Exception;

public class Main {
    public static void main(String[] args) {
        // Cause NumberFormatException
        long begin = System.currentTimeMillis();
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }

        // Cause StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            char ch = str.charAt(10); // Trying to access character at index 10, which is out of bounds
            System.out.println("Character at index 10: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        // Solving NumberFormatException
        try {
            String str = "123";
            int num = Integer.parseInt(str);
            System.out.println("Parsed Number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
            // Provide a default value or handle the situation appropriately
            System.out.println("Using default value instead.");
            int defaultValue = 0;
            System.out.println("Default Value: " + defaultValue);
        }

        // Solving StringIndexOutOfBoundsException
        try {
            String str = "Hello";
            int index = 1;
            if (index >= 0 && index < str.length()) {
                char ch = str.charAt(index);
                System.out.println("Character at index " + index + ": " + ch);
            } else {
                System.out.println("Index is out of bounds.");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException occurred: " + e.getMessage());
        }
        long end = System.currentTimeMillis();
         long time = end-begin;
        System.out.println(time);
    }
}
