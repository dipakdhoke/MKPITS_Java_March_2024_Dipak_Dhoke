package allprogram;

import java.io.*;
import java.util.Scanner;

public class FileOperation {

    private static Student s;

    public static File fileObjectCreator()   //method for creation of file object
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter path of file");
        String path = scanner.next();
        System.out.println("please enter file name(txt)");
        String fname = scanner.next();
        File file = new File(path, fname);
        return file;

    }

    public static void countWordLineChrecter(File file) {

        int lines = 0, word = 0, charecter = 0;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {
                {
                    String[] str = string.split(" ");
                    word += str.length;
                    System.out.println(string);
                    for (int i = 0; i < str.length; i++) {
                        charecter += str[i].length();
                    }
                    string = bufferedReader.readLine();
                }
                lines++;

            }

            System.out.println("word " + word + " lines" + lines + " charecter" + charecter);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void occurenceOfString(String chk_str) {
        File file = fileObjectCreator();
        int count = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;

            string = bufferedReader.readLine();
            while (string != null) {
                String[] str = string.split(" ");
                for (String s : str) {
                    if (s.equalsIgnoreCase(chk_str)) {
                        count++;
                    }
                }
                string = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(chk_str + " is" + count + " times");
    }

    public static void writeFile(String path, String fname) {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter;  //creating object out of try catch block


        try {
            File file = new File(path, fname);
            bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String name, choice;
            do {
                System.out.println("please enter the name");
                name = bufferedReader.readLine();
                bufferedWriter.write(name + "\n");
                System.out.println("Do want to enter another name :(Y/N)");
                choice = bufferedReader.readLine();
            } while (choice.equalsIgnoreCase("y"));

            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Data Entered Successfully");
        }

    }

    public static void readFile(String path, String fname) {


        try {
            File file = new File(path, fname);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {
                if (string != null) {
                    System.out.println(string);
                    string = bufferedReader.readLine();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

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
                System.out.println("The data copied successfully from file " + source.getName() + " to" + destination.getName());

            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println("file not found");
        }

    }

    public static void deleteFile(File file) {
        file.delete();
        System.out.println("File deleted successfully");
    }

    public static void encryptionFile() {
        File file_orignal = fileObjectCreator();
        File file_encrpted = fileObjectCreator();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file_orignal));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_encrpted));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {

                {
                    String[] str = string.split(" ");


                    for (int i = 0; i < str.length; i++) {
                        for (int j = 0; j < str[i].length(); j++) {
                            int ascii = str[i].codePointAt(j);
                            bufferedWriter.write(ascii + ",");

                        }
                        bufferedWriter.write(" ,");  // creating space between code of each word
                    }
                    string = bufferedReader.readLine();
                    bufferedWriter.newLine();
                }


            }


            bufferedWriter.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    public static void decryptFile() {

        File file_orignal = fileObjectCreator();
        File file_encrpted = fileObjectCreator();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file_orignal));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_encrpted));
            String string;
            string = bufferedReader.readLine();
            while (string != null) {

                {
                    String[] str = string.split(",");


                    for (int i = 0; i < str.length; i++) {

                        if (str[i].equals(" ")) {
                            bufferedWriter.write(" ");
                        } else {
                            int a = Integer.parseInt(str[i]);
                            char c = (char) a;
                            bufferedWriter.write(c);
                        }

                    }
                    string = bufferedReader.readLine();
                    bufferedWriter.newLine();
                }


            }


            bufferedWriter.close();
            bufferedReader.close();
            System.out.println("Data decrypt Successfully");
        } catch (Exception e) {
            System.out.println(e);


        }

    }

    public static void writeStudentOnFile(Student s)
    {
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("abc.txt"));
            objectOutputStream.writeObject(s);
            objectOutputStream.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static Student  readStudentFromFile(){

        Student student=null;       //declairing object
        try
        {
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("abc.txt"));
            student=(Student) objectInputStream.readObject();
            return student;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return student;
    }
}