package writingFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class File1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter;

        try {
            String choice = "";
            bufferedWriter= new BufferedWriter(new FileWriter("abc.txt",true));

            do {
                String name;
                System.out.print("enter name");
                name=bufferedReader.readLine();

                bufferedWriter.write(name+"\n");
                System.out.println("enter choice Y/N");
                choice=bufferedReader.readLine();

            }while(choice.equalsIgnoreCase("y"));
            bufferedWriter.close();


        }catch (IOException e){
            System.out.println(e);

        }
    }
}
