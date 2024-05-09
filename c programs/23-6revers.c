


#include <stdio.h>
#include<conio.h>

// Function to check whether a number is even or odd
void reverse(int n) {
   int rev=0;
   int r;   
    while(n>0){
 	 r=n%10;
     rev=rev*10+r;
     n=n/10;
 	
 }
 printf("revers of num is %d",rev); 
}

void main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    // Call the function to check whether the number is even or odd
    reverse(number);


}

