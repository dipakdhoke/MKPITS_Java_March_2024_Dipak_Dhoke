#include <stdio.h>
#include<conio.h>

// Function to find the greatest of three numbers
int findGreatest(int num1, int num2, int num3) {
    int greatest = num1;

    // Check if num2 is greater than greatest
    if (num2 > greatest) {
        greatest = num2;
    }

    // Check if num3 is greater than greatest
    if (num3 > greatest) {
        greatest = num3;
    }

    return greatest;
}

void main() {
    int num1, num2, num3;

    // Input three numbers
    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    // Call the function to find the greatest number and print the result
    printf("The greatest number is: \n", findGreatest(num1, num2, num3));

    
}