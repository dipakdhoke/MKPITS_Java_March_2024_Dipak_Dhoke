package readingfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filetwo {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {
                if (string != null) {
                    System.out.println(string+"\n");
                    string = bufferedReader.readLine();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    }


