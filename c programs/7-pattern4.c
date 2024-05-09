#include<stdio.h>
#include<conio.h>
void main()
{
  int i,j;
  for(i=1;i<8;i++){
  	for(j=1;j<8-i;j++){
	  
	  printf("2");
	  
	  }
	  for(j=1;j<=2*i-1;j++){
	  
	  printf("*");
	  
	  }
    printf("\n");
 
  }
  
   for(i=8;i>0;i--){
  	for(j=1;j<8-i;j++){
	  
	  printf("1");
	  
	  }
	  for(j=1;j<=2*i-1;j++){
	  
	  printf("*");
	  
	  }
    printf("\n");
 
  }

}

