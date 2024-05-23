#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int arr[5],c1=0,c2=0;
 	printf("enter the numbers:");
 	for(int i=0;i<5;i++){
 		
 		scanf("%d",&arr[i]);
		 if(arr[i]%2==0){
		 	c1++;
		 }
		 else{
		 	c2++;
		 }
		  }
		
 	printf("count of even:%d,count of odd %d",c1,c2);
 }