

#include <stdio.h>
#include<conio.h>


void armstrong(int n) {
  int sum=0,r,on;
on=n;

while(n>0) {
	 
	 r=n%10;
	 sum=sum+r*r*r;
	 n=n/10;
	 
	 
	
}
	 printf("sum  is %d",sum);

if(sum==on) {
	printf("\nits armstrong number");
}
else {
	printf("\nnot arm strong");  
} 
 	
 }
 


void main() {
    int number;

    // Input the number
    printf("Enter a number: ");
    scanf("%d", &number);

    
    armstrong(number);


}




