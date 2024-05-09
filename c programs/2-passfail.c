#include <stdio.h>
#include<conio.h>

// Function to check whether a number is even or odd
void result(int num) {
    if (num >= 50) {
        printf("pass\n");
    } else {
        printf("fail\n");
    }
}

void main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    result(number);


}