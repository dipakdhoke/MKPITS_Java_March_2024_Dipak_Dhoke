#include <stdio.h>
#include<conio.h>


void prime(int n) {
 int i=2;
   while (i < n) {

       if(n%i ==0){
       	
       	break;   
	   }
       
        i++;
    
   }
     if(n==i){
     	printf("prime no ");
	 }
	 else{
	 	printf("not a prime no");
	 }
}


void main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    
    prime(number);


}


 