#include <stdio.h>
#include<conio.h>

void main() {
    int N, i = 0, firstTerm = 0, secondTerm = 1, nextTerm;

    // Input the number of terms
    printf("Enter the number of terms: ");
    scanf("%d", &N);

    // Print the Fibonacci series using a do-while loop
    printf("Fibonacci series up to %d terms:\n", N);
    do {
        if (i <= 1) {
            nextTerm = i;
        } 
		else {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        printf("%d, ", nextTerm);
        i++; 
    } while (i < N);

    
}