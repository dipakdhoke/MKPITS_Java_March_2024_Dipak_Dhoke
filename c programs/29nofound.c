#include <stdio.h>    
     
int main()    
{      
    int arr[100];     
    int found=0;
	int size,v1; 
	printf("Enter size of the array (1-1000): ");
    scanf("%d", &size);   
            
         
    printf("Enter Elements of original array: \n");    
    for (int i = 0; i < size; i++) {     
        scanf("%d",&arr[i]);     
    }       
      printf("enter the no to compare:\n");
	  scanf("%d",&v1);
	  
	 for(int i=0;i<size;i++){
	 	if(arr[i]==v1){
	 		found=1;
	 		 break;	
	 }
	
	 }
	 if(found){
	 	printf("number is found ");
	 }else{
	 	printf("not found");
	 }	
	 
		 	
}