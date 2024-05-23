#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int arr[5],s=0,a,c=0
	float avg;
 	printf("enter the numbers");
 	for(int i=0;i<5;i++){
 		scanf("%d",&arr[i]);
 	}
		for(int i=0;i<5;i++){
 	         s=s+arr[i];
		     c=c+1;
		  }	 
		
		  avg=s/c;
 	printf("sum is:%d,avg is %3f",s,avg);
 }