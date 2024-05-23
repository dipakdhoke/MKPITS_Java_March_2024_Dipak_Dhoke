package File;

import java.io.File;

public class file {
    public static void main(String[] args) {
        File f =new File("C:\\Users\\Acer\\Desktop\\assingments");
        File f1=new File(f,"file2.txt");
        File f2 =new File("C:\\Users\\Acer\\Desktop\\assingments","file2.txt");
        File f4=new File("abc.txt");
        System.out.println(f.exists());
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        System.out.println(f4.exists());
        f.getAbsolutePath();
        f.length();

    }
}
