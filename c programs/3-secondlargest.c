#include <stdio.h>
#include <limits.h> // For INT_MIN

 // Maximum array size 

int main()
{
    int arr[100], size, i;
    int  temp;

    /* Input size of the array */
    printf("Enter size of the array (1-1000): ");
    scanf("%d", &size);

    /* Input array elements */ 
    printf("Enter elements in the array: ");
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

     


    /*
     * Check for first largest and second
     */
    for(i=0; i<size; i++)
    { 
    
        for(int j=i+1;j<size;j++){
        	if(arr[i]>arr[j]){
        		temp=arr[i];
        		arr[i]=arr[j];
        		arr[j]=temp;
			}	
		}
        
    }

    printf("Second largest = %d",arr[size-1]);

    return 0;
}