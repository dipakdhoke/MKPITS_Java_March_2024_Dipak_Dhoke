#include <stdio.h>    
     
int main()    
{      
    int arr[100];     
    int temp = 0;
	int size,min,max,mid,found=0,n; 
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
	 printf("enter the number");
	 scanf("%d",&n);
	 min=0;
	 max=size-1;
	 for(mid=(min+max)/2;min<max;mid=(min+max)/2){
	 	if(n==arr[mid]){
	 		found=1;
	 		break;
		 }
	  if( n>arr[mid]){
	 	min=mid+1;
	 	
	 }else{
	 	max=mid-1;
	 }
}
	 if(found==1){
	 	printf("no found");
	 }else{
	 	printf("not found");
	 	
	 	
	    
    } 	


}