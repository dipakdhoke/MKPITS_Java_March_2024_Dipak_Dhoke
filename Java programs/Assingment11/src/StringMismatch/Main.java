package StringMismatch;

public class Main {
    static void compare2String(String str1,String str2) throws StringMismatch{
        if(!str1.equals(str2)){
            throw new StringMismatch("Strings are not equal");

        }
    }

    public static void main(String[] args) {
         String str3 = "Hello";
        String str4 ="World";
        try{
            compare2String(str3,str4);
        }catch (StringMismatch e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
