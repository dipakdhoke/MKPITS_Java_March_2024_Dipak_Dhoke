#include<stdio.h>
#include<conio.h>
void main() 
{
 int i=1,s=0 ,n=0 ;
 int c;
 printf("enter how many time no of sum");
 scanf("%d",&c);
 while (i <= c) {
 printf("enter the no i");
 scanf("%d",&n);
 s=s+n;
 i++;
 }
 printf("sum of first 10 no %d",s);
}