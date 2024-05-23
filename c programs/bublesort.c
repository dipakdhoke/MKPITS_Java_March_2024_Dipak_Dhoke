#include <stdio.h>    
     
int main()    
{      
    int arr[100];     
    int temp = 0;
	int size; 
	printf("Enter size of the array (1-1000): ");
    scanf("%d", &size);   
             
         
    printf("Enter Elements of original array: \n");    
    for (int i = 0; i < size; i++) {     
        scanf("%d",&arr[i]);     
    }       
        
    for (int i=0;i<size-1;i++){
    	for(int j=0;j<size-i-1;j++){
    	
		if(arr[j]>arr[j+1]){           
            temp=arr[j];
    		arr[j]=arr[j+1];
    		arr[j+1]=temp;
			}	
    		
		}
	}
    printf("Elements of array sorted in ascending order: \n");    
    for (int i = 0; i < size; i++) {     
        printf("%d ", arr[i]);    
    } 	
}