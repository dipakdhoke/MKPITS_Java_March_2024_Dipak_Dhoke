package Copyfle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file1 =new File("abc.txt");
        File file2 =new File("xyz.txt");
        File1.copyFile(file1,file2 );
    }
}
