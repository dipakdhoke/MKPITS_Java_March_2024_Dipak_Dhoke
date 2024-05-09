#include<stdio.h>
#include<conio.h>
void main() 
{
  int n1;
  float sum=0,avg,n;
 
  printf("enter  how many times no to be enter");
  scanf("%d",&n1);
  
  for(int i=0;i<n1;i++){
  	 
	   printf("enter the numbers\n");
	   scanf("%f",&n);
	   sum=sum+n;
	   
	   
	  
  	
  	
  	
  }
  avg=sum/n1;
  printf("average is:%f",avg);
}