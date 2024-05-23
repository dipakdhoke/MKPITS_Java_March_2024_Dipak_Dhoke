#include<stdio.h>
#include<conio.h>
void main() 
{

int sum=0,n,r,on;
printf("enter the number");
scanf("%d",&n);
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
