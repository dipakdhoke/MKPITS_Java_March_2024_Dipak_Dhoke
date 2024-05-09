#include <stdio.h>
#include<conio.h>

// Function to check whether a number is even or odd
void checkEvenOdd(int num) {
    if (num % 2 == 0) {
        printf("%d is even.\n", num);
    } else {
        printf("%d is odd.\n", num);
    }
}

void main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Call the function to check whether the number is even or odd
    checkEvenOdd(number);


}