#include <stdio.h>    
     
int main()    
{      
    int arr[100];     
    int temp = 0;
	int count,size,v1; 
	printf("Enter size of the array (1-1000): ");
    scanf("%d", &size);   
            
         
    printf("Enter Elements of original array: \n");    
    for (int i = 0; i < size; i++) {     
        scanf("%d",&arr[i]);     
    }       
      printf("enter the no to compare:");
	  scanf("%d",&v1);
	  
	 for(int i=0;i<size;i++){
	 	if(arr[i]==v1){
	 		printf("  number is found at this position %d\n",i+1);
	 		count++;
		 }
	 }
	 printf("no of times number display is:%d\n",count);
	   
	}
   	
