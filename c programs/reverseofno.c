#include<stdio.h>
#include<conio.h>
void main() 
{
 printf("hellow");
 int n,r,rev;
 printf("enter a number 3 digit no");
 scanf("%d",&n);
 while(n>0){
 	 r=n%10;
     rev=rev*10+r;
     n=n/10;
 	
 }
 printf("reverse no is %d",rev);

}