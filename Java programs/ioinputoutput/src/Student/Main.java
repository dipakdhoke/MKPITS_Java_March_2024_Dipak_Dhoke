package Student;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        String name;
        int mark;
        String choice;
        Scanner scanner=new Scanner(System.in);
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("xlz.txt"));
          do {
              System.out.println("please enter the mark of student");
              mark = scanner.nextInt();
              System.out.println("please enter the name of student");
              name = scanner.next();
              stud student = new stud(name, mark);
              objectOutputStream.writeObject(student);
              System.out.println("enter choice y/n");
              choice =scanner.next();
          }while(choice.equalsIgnoreCase("y"));
            objectOutputStream.close();
            System.out.println("Object stored successfuly");
            System.out.println(("Do you wish to see data:(Y/N)"));
            choice= scanner.next();

            if (choice.equalsIgnoreCase("y")){

                ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("xlz.txt"));
                    stud student;

                    do {
                         student=(stud) objectInputStream.readObject();
                        System.out.println(student.getName()+" "+student.getMarks());
                        if(student==null){
                            System.out.println("item diplayed");
                        }
                    }while(student==null);

            }

        } catch (IOException e) {
            System.out.println(e);

        }

    }
}
