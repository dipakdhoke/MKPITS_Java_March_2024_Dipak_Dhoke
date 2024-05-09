#include <stdio.h>

// Function to calculate the factorial of a number
    long factorial(int num) {
    long fact = 1;
    int i;

    // Calculate factorial
    for (i = 1; i <= num; i++) {
        fact *= i;
    }

    return fact;
}

int main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Call the function to calculate the factorial and print the result
    printf("Factorial of %d is %llu\n", number, factorial(number));

    return 0;
}
