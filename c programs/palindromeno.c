#include<stdio.h>
#include<conio.h>
void main() 
{
 int n,r,rev,on;
 printf("enter a number:");
 scanf("%d",&n);
 on=n;
 while(n>0){
 	 r=n%10;
     rev=rev*10+r;
     n=n/10;
 	
 }
if(on==rev){
	printf("its palindrome number");
}else{
	printf("its not palindrome number");
}

}