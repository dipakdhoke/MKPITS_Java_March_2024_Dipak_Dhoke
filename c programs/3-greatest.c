#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int arr[5],great;
 	printf("enter the numbers:");
 	for(int i=0;i<5;i++){
 		
 		scanf("%d",&arr[i]);
 	}
 	     great=arr[0];
 	    for(int i=0;i<5;i++){
		 if(arr[i]>great){
		 	great=arr[i];
		 }
		 
		  }
		
 	printf("greatest no is:%d",great);
 }