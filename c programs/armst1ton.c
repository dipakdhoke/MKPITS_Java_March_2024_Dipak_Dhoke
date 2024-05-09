#include <stdio.h>


int main() {
    int n;

    // Input the value of n
    printf("Enter the value of n: ");
    scanf("%d", &n);

    // Print Armstrong numbers between 1 and n
    printf("Armstrong numbers between 1 and %d are:\n", n);
    for (int i = 1; i <= n; i++) {
        int originalNum = i;
        int sum = 0;

        // Count the number of digits
        int temp = originalNum;

        // Calculate the sum of digits raised to the power of numberOfDigits
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit*digit*digit;
            temp /= 10;
        }

        // Check if i is Armstrong and print it
        if (sum == i) {
            printf("%d\n", i);
        }
    }

    return 0;
}