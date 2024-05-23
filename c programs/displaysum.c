#include<stdio.h>
#include<conio.h>
void main() 
{
 int i=1 ,s=0 ,n=0   ;
 while (i <= 10) {
 printf("enter the no ");
 scanf("%d",&n);
 s=s+n;
 i++;
 }
 printf("sum of first 10 no %d",s);
}