#include<stdio.h>
#include<conio.h>
void main() 
{
   int i=1,s=0 ,n=0 ,count1=0,count2=0 ;
   int c;
   printf("enter how many time no");
   scanf("%d",&c);
   while (i <= c) {
     printf("enter the no i");
     scanf("%d",&n);
     if(n%2==0){
 	   count1++;
      }
	  else{  
 	 count2++;
    }
    i++;
 }
    printf("even no %d,odd no is %d",count1,count2);
    getch();
   
}    