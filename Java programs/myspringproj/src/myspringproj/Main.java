package myspringproj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
	    Student student=(Student) context.getBean("s");
	    student.displaydetails();
	    context.getBean("s1");
	    student.displaydetails();
	    
	}

}
