package staticutility;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";

        // Reverse the string
        String reversed = StringUtils.reverseString(str);
        System.out.println("Reversed string: " + reversed);

        // Count occurrences of a substring
        String subStr = "o";
        int count = StringUtils.countOccurrences(str, subStr);
        System.out.println("Number of occurrences of '" + subStr + "': " + count);

        // Convert string to uppercase
        String upperCaseStr = StringUtils.toUpperCase(str);
        System.out.println("Uppercase string: " + upperCaseStr);
    }
}