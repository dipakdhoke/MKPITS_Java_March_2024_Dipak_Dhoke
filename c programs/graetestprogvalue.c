#include <stdio.h>
#include<conio.h>

// Function to find the greatest of three numbers
int findGreatest(int num1, int num2, int num3) {
    int greatest = num1;

    // Check if num2 is greater than greatest
    if (num1>num2) {
        if(num1>num3){
        	greatest=num1;
		}else{
			greatest=num3;
			
		}
    }else if(num2>num3){
    	greatest=num2;
    	
    	
	}else{
		greatest=num3;
	}

    // Check if num3 is greater than greatest


    return greatest;
}

void main() {
    int num1, num2, num3;

    // Input three numbers
    printf("Enter three numbers: ");
    scanf("%d %d %d", &num1, &num2, &num3);

    // Call the function to find the greatest number and print the result
    printf("The greatest number is: %d\n", findGreatest(num1, num2, num3));

    
}