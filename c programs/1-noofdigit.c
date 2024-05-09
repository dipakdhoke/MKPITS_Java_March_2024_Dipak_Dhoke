#include<stdio.h>
#include<conio.h>
void main(){
	int n,i,count=0;
	printf("enter the number");
	scanf("%d",&n);
	for(i=0;n>0;i++){
		n=n/10;
		count++;
	}
	printf("no of digit is:%d",count);
}