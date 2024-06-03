package Arraydeque;

import java.util.ArrayDeque;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char ch : str.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println("Is the string '" + str + "' a palindrome? " + isPalindrome(str));
    }
}
