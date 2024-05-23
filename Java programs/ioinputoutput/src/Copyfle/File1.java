package Copyfle;
import java.io.*;

public class File1  {

    public static void copyFile(File source, File destination) {
        if (source.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(source));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination));
                String string;
                string = bufferedReader.readLine();
                while (string != null) {

                    bufferedWriter.write(string);
                    string = bufferedReader.readLine();
                    bufferedWriter.newLine();
                }
                  bufferedWriter.close();
                bufferedReader.close();
                System.out.println("copied succsefully");

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
            System.out.println("file not found");
        }

    }
}
