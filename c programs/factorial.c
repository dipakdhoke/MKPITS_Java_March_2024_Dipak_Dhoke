#include<stdio.h>  
#include<conio.h>
void main() 
{
   int f=0 ,n,i=1;
   printf("enter the no");
   scanf("%d",&n);
   while (i <= n) {

       f=f*i;
       
        i++;
        printf("checking f %d \n",f);
    }
   printf("factorial is %d",f);
 }