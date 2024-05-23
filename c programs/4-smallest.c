#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int arr[5],s;
 	printf("enter the numbers:");
 	
 	for(int i=0;i<5;i++){
 		
 		scanf("%d",&arr[i]);
 	}
 	 
 	s=arr[0];	 	  
 	for(int i=0;i<5;i++){
 		 if(arr[i]<=s){
		 	s=arr[i];
	}
		 
		  }
	printf("smallest no is:%d",s);		
}
 
 