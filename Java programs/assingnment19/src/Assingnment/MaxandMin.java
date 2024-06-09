package Assingnment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxandMin {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<Student>(){{
            add(new Student("Dipak",24));
            add(new Student("rakesh",29));
            add(new Student("saptak",30));
            add(new Student("prajwal",21));

        }};
        Optional<Student> student=list.stream().max(Comparator.comparing(Student::getAge));
        System.out.println(student);
        Optional<Student> student1=list.stream().min(Comparator.comparing(Student::getAge));
        System.out.println(student1);
    }
}
