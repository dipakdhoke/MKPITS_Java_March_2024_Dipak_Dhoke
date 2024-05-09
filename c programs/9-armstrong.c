#include <stdio.h>
#include <stdbool.h>

// Function to check if a number is Armstrong
bool isArmstrong(int num) {
    int originalNum = num;
    int sum = 0;
    int digit;

    while (num != 0) {
        digit = num % 10;
        sum += digit * digit * digit;
        num /= 10;
    }

    return originalNum == sum;
}

// Function to display Armstrong numbers between two numbers
void displayArmstrongNumbers(int start, int end) {
    printf("Armstrong numbers between %d and %d are:\n", start, end);
    for (int i = start; i <= end; i++) {
        if (isArmstrong(i)) {
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

    // Call the function to display Armstrong numbers
    displayArmstrongNumbers(num1, num2);

    return 0;
}
