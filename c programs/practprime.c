#include <stdio.h>
#include <stdbool.h>

// Function to check if a number is prime
bool isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i<= num/2; i++) {
        if (num % i != 0) {
            return true;
        }else{
        	return false;
		}
    }  
    return true;
}

// Function to display prime numbers between two numbers
void displayPrimeNumbers(int start, int end) {
    printf("Prime numbers between %d and %d are:\n", start, end);
    for (int i = start; i <= end; i++) {
        if (isPrime(i)) {
            printf("%d\n", i);
        }
    }
}

int main() {
    int num1, num2;

    // Input two numbers
    printf("Enter the first number: ");
    scanf("%d", &num1);
    printf("Enter the second number: ");
    scanf("%d", &num2);

    // Call the function to display prime numbers
    displayPrimeNumbers(num1, num2);

    return 0;
}
