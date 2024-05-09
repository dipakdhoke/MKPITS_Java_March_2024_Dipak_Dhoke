#include<stdio.h>
#include<conio.h>
void main() 
{
  int n;
  float sum;
  
  printf("enter the no");
  scanf("%d",&n);
  //printf("%d %d",n1,n2);
 for (int i = 1; i <= n; i++) {
        sum += 1.0 / i;  // Cast integer division to float for accurate sum
    }
  	 
	   printf("%f\n",sum);
  	 
  	
  }
