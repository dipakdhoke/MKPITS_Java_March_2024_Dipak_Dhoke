package allprogram;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;
        String path;
        String fname;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Choice \n1.Write File\n2.Read File\n3.Copy File\n4.Delete File\n5.Occurence of Word,Lines,Charecter\n6.Occurence of Given Word in File");
        choice=scanner.nextInt();


        switch (choice) {

            case 1:
                FileOperation.writeFile("C:\\Users\\Lenovo\\Desktop\\Mkp\\java\\jp_inputoutput", "practice.txt");
                break;

            case 2:
                FileOperation.readFile("C:\\Users\\Lenovo\\Desktop\\Mkp\\java\\jp_inputoutput", "practice.txt");
                break;


            case 3:
                System.out.println("SOURCE FILE");                     //creating object of source file
                File file_source = FileOperation.fileObjectCreator();

                System.out.println("DESTINATION FILE");                //creating object of destination file
                File file_destination = FileOperation.fileObjectCreator();

                FileOperation.copyFile(file_source, file_destination);
                break;

            case 4:
                File file_delete = FileOperation.fileObjectCreator();
                FileOperation.deleteFile(file_delete);
                break;

            case 5:
                File file_count = FileOperation.fileObjectCreator();
                FileOperation.countWordLineChrecter(file_count);

            case 6:
                System.out.println("enter the word");
                String substring = scanner.next();
                FileOperation.occurenceOfString(substring);
                break;

            case 7:
                FileOperation.encryptionFile();
                break;

            case 8:
                FileOperation.decryptFile();
                break;

            case 9:
                Student s = new Student(90,"Sourabh");
                FileOperation.writeStudentOnFile(s);
            case 10:
                FileOperation.readStudentFromFile();

            case 11:
                Student student=FileOperation.readStudentFromFile();
                System.out.println(student.getMark()+" "+student.getName());



            default:
                return;



        }

    }
}