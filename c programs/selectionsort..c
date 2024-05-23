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
        
    for (int i=0;i<size;i++){
    	for(int j=i+1;j<size;j++){
    	
		if(arr[i]>arr[j]){           
            temp=arr[i];
    		arr[i]=arr[j];
    		arr[j]=temp;
			}	
    		
		}
	}
    printf("Elements of array sorted in ascending order: \n");    
    for (int i = 0; i < size; i++) {     
        printf("%d ", arr[i]);    
    } 	
}