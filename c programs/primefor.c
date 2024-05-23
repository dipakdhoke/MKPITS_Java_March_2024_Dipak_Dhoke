#include<stdio.h>
#include<conio.h>
void main() 
{

int n;
printf("enter the number");
scanf("%d",&n);

for (int i=0;i<=n/2;i++) {
	if(n%i==0){
		printf("its prime");
		break;
	}
	else{
		printf("its not prime");
	}
	
}

}