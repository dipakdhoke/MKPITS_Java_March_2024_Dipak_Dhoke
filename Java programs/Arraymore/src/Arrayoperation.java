import java.util.Arrays;

public class Arrayoperation {
//4
    public void evenoddSepration(int arr[]) {
        int[] arr1=new int[arr.length-1];
           int[] arr2=new int[arr.length-1];
        int j=0;
        int k=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                arr1[j]=arr[i];
                j++;
            }
            else if (arr[i]%2!=0) {
                arr2[k]=arr[i];
                k++;
            }
        }
        System.out.println("even no's");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("odd no's");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    //6
    public void frequency(int arr[],int no) {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==no) {
                count++;
            }
        }
        System.out.println(count);
    }
  //7
  public void incrementElement(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
          arr[i]=arr[i]+1;
      }
      for (int i = 0; i < arr.length; i++) {
          System.out.println(arr[i]);
      }
  }
// 9
public void evenElementsatEvenIndex(int arr[]) {
    for (int i = 0; i < arr.length; i=i+2) {
        if (arr[i]%2 == 0) {
            System.out.println(arr[i]);
        }
    }
}
 //10

    public void oddElementsatEvenIndex(int arr[]) {
        for (int i = 1; i < arr.length; i=i+2) {
            if (arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
//11
public void sortStringArrayAscending(String[] strings) {
    System.out.println("string array before sort");
    for (int i = 0; i < strings.length; i++) {
        System.out.println(strings[i]);
    }
    Arrays.sort(strings);
    System.out.println("string array after sort");
    for (int i = 0; i < strings.length; i++) {
        System.out.println(strings[i]);
    }
}
}
