package Student;

import java.io.*;

public class stud implements Serializable {
    private String name;
    private int marks;
    stud(String name,int marks){
        this.name=name;
        this.marks=marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    public static void writeStudent(stud std) throws IOException {
        BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("abc.txt"));
        bufferedWriter.write(std.name);
        bufferedWriter.write(std.marks);
        bufferedWriter.close();

    }

    public static void writestudent2(stud std){

        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("xyz.txt"));
            objectOutputStream.writeObject(std);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public static stud readfromfile(){
          stud student=null;
        try {
            ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("xyz.txt"));
            student=(stud) objectInputStream.readObject();
            return student;

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return student;
    }

}
