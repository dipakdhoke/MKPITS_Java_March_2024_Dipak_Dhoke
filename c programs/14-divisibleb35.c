#include <stdio.h>
#include<conio.h>

void main() {
    int N;
    int i, count = 0;
    int sum = 0;

    // Input the value of N
    printf("Enter the value of N: ");
    scanf("%d", &N);

    // Find the first N natural numbers divisible by both 3 and 5
    for (i = 1; count < N; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            sum += i;
            count++;
        }
    }

    // Print the sum
    printf("The sum of the first %d natural numbers divisible by both 3 and 5 is: %d\n", N, sum);

    
}
