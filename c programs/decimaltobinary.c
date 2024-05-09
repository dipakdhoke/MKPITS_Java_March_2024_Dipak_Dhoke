#include<stdio.h>
#include<conio.h> 

int main() {
    int decimalNum, binaryNum[32], i = 0;

    // Input decimal number
    printf("Enter a decimal number: ");
    scanf("%d", &decimalNum);

    // Convert decimal to binary
    while (decimalNum > 0) {
        binaryNum[i] = decimalNum % 2;
        decimalNum = decimalNum / 2;
        i++;
    }

    // Print binary representation
    printf("Binary representation: ");
    for (int j = i - 1; j >= 0; j--) {
        printf("%d", binaryNum[j]);
    }

    return 0;
}
