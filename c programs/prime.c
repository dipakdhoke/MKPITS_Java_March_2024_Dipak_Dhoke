#include<stdio.h>  
#include<conio.h>
void main() 
{
   int n,i=2;
   printf("enter the no");
   scanf("%d",&n);
   while (i < n) {

       if(n%i ==0){
       	
       	break;   
	   }
       
        i++;
    
   }
     if(n==i){
     	printf("prime no ");
	 }
	 else{
	 	printf("not a prime no");
	 }
 }