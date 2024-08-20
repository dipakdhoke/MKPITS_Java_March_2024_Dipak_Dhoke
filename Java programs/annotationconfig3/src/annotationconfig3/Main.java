package annotationconfig3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext  context = new AnnotationConfigApplicationContext(appconfig.class);
	 Student student=(Student) context.getBean(Student.class); 
	 student.displaydetails();
	
	 
	}

}
