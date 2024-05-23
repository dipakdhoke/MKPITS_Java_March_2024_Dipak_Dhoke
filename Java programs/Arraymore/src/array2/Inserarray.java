package array2;

public class Inserarray {
    public static void array (int arr[]){
       int index=5;
       int value=56;
       arr[index]=value;
       for (int i=0;i< arr.length;i++){
           System.out.println(arr[i]);
       }
    }
    public static void main(String[] args) {
        int ar[]={2,44,5,5,66,7};
        array(ar);
    }

}

