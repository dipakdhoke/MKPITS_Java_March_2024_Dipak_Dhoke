package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	    Student student1=(Student) context.getBean("s1");
	    student1.displaydetails();
	    
	    Student student2=(Student)context.getBean("s2");
	    student2.displaydetails();
	    
	    Student student3=(Student)context.getBean("s3");
	    System.out.println(student3);
	    
	    Student student4=(Student)context.getBean("s4");
	    System.out.println(student4);
	    
	    Student student5=(Student)context.getBean("s5");
	    System.out.println(student5);
	    
	    Student student6=(Student)context.getBean("s6");
	    System.out.println(student6);
	}

}
