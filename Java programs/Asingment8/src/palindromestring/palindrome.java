package palindromestring;

public class palindrome {
    public void palindrm(String str){
        int length= str.length();
        int flag=0;
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("string is palindrome");
        }else {
            System.out.println("string is not palindrome");
        }
    }
}
