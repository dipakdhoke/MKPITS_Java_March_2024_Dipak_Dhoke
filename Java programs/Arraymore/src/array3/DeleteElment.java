package array3;

public class DeleteElment {
    public  static void deleteele(int arr[],int n){
        int arr1[]=new int[arr.length];
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=n){
                arr1[j]=arr[i];
                j++;
            }

        }
       for(int i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);
       }
    }

    public static void main(String[] args) {
        int arra[]={12,3,44,24,34,7,16,13};
        deleteele(arra,44);
    }
}
