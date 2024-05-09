#include <stdio.h>
#include<conio.h>

void main() {
    int N, i;
    long long sum = 0; // Using long long to handle larger sums

    // Input the value of N
    printf("Enter the value of N: ");
    scanf("%d", &N);

    // Calculate the sum of the series
    for (i = 1; i <= N; i++) {
        sum += i * i; // Add the square of the current number to the sum
    }

    // Print the sum
    printf("The sum of the series is: %lld\n", sum);


}