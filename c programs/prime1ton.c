#include <stdio.h>
#include<conio.h>

void main() {
    int N;
    int isPrime; // Flag to indicate if a number is prime
    

    printf("Enter the value of N: ");
    scanf("%d", &N);
    
    printf("Prime numbers between 1 and %d are:\n", N);
    for (int i = 2; i <= N; i++) {
        isPrime = 1; // Assume number is prime initially
        
        // Check if i is divisible by any number other than 1 and itself
        for (int j = 2; j*j  <= i; j++) {
            if (i % j == 0) {
                isPrime = 0; // If i is divisible, it's not prime
                break; // No need to check further
            }
        }
        
        // If isPrime is still 1, then i is prime, so print it
        if (isPrime == 1) {
            printf("%d\n", i);
        }
    }
    
}