package File3;

import java.io.*;

public class readfile {

    public static void Readfromfile(String file) {
        File file1 = new File(file);
        if (file1.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
                String string;
                string = bufferedReader.readLine();
                while (string != null) {
                    if (string != null) {
                        System.out.println(string + "\n");
                        string = bufferedReader.readLine();
                    }
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else {

          System.out.println("file not found");
        }
    }

    public static void copy(String file) throws IOException {

        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("xyz.txt"));
        BufferedReader bufferedReader=new BufferedReader(new FileReader("xyz.txt"));
        System.out.println("enter the name");

    }
}

