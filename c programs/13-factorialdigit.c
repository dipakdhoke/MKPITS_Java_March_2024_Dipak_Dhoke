#include <stdio.h>
#include<conio.h>

void main() {
    int num, i;
    unsigned long long factorial = 1;
    int numDigits = 0;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &num);

    // Calculate factorial
    for (i = 1; i <= num; i++) {
        factorial *= i;
    }

    // Count number of digits in the factorial
    while (factorial != 0) {
        factorial /= 10;
        numDigits++;
    }

    // Print the number of digits in the factorial
    printf("The number of digits in the factorial of %d is: %d\n", num, numDigits);

    
}
