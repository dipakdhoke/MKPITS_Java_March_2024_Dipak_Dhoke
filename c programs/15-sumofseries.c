#include <stdio.h>
#include<conio.h>

void main() {
    int N, i;
    double sum = 0;
    double factorial = 1;

    // Input the value of N
    printf("Enter the value of N: ");
    scanf("%d", &N);

    // Calculate the sum of the series
    for (i = 1; i <= N; i++) {
        factorial *= i; // Calculate the factorial of i
        sum += (double)i / factorial; // Add i/i! to the sum
    }

    // Print the sum
    printf("The sum of the series is: %.2lf\n", sum);


}
