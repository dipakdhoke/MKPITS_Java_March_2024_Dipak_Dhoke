package encription;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String for Encryption: ");
        String message = scanner.nextLine();

        System.out.print("Enter the shift value (1-25): ");
        int shift = scanner.nextInt();

        String encryptedMessage = encrypt(message, shift);
        System.out.println("Encrypted message: " + encryptedMessage);
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char shiftedChar = (char) (((c - 'A' + shift) % 26) + 'A');
                encryptedMessage.append(shiftedChar);
            } else {
                encryptedMessage.append(c);
            }
        }

        return encryptedMessage.toString();
    }
}
