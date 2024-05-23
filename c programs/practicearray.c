#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int array[5],largest,secondLargest;
 	printf("enter the numbers for arr1:");
 	
 	for(int i=0;i<5;i++){
 		
 		scanf("%d",&array[i]);
 	}

    largest = array[0];
    secondLargest = array[0];

    // Find the largest element in the array
    for (int i = 1; i < 5; i++) {
        if (array[i] > largest) {
            secondLargest = largest;
            largest = array[i];
        } else if (array[i] > secondLargest && array[i] != largest) {
            secondLargest = array[i];
        }
		
	}  
    printf("The second largest element in the array is: %d\n", secondLargest);
  }