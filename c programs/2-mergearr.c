#include<stdio.h>
#include<conio.h>
 void main(){
 	
 	int arr1[5],arr2[5],arr3[10];
 	printf("enter the numbers for arr1:");
 	
 	for(int i=0;i<5;i++){
 		
 		scanf("%d",&arr1[i]);
 	}
 	
 	printf("enter the numbers for arr2:");
 	
 	for(int j=0;j<5;j++){
 		
 		scanf("%d",&arr2[j]);
 	}
	 
	 	 	  
 	for(int i=0;i<5;i++){
 	         arr3[i]=arr1[i];
 			 
     
		  }
            for(int j=0;j<5;j++){
 	         arr3[5+j]=arr2[j];
 			 
		  }
    for (int i = 0; i < 10; i++) {
        printf("%d ", arr3[i]);
    }
    printf("\n");
}