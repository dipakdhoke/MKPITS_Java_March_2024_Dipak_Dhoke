#include<stdio.h>
#include<conio.h>
void main() 
{

int i=0,n,great=0;
int n1;
printf("enter the number of times");
scanf("%d",&n1);

while(i < n1) {
	
    printf("enter the no");
    scanf("%d",&n);
    if(n>=great){
    	great=n;
	}
	i++;
	
}
printf("greatest no is %d",great);   
}
