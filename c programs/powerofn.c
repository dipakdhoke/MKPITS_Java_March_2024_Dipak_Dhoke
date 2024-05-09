#include<stdio.h>
#include<conio.h>
void main(){
       int i,n,p,power=1;
       printf("enter the no\n");
       scanf("%d",n);
       printf("enter its power\n");
       scanf("%d",p);
       for(i=;i<p;i++){
       	power=power*n;
	   }
     printf("power of no is:%d",power);   
}