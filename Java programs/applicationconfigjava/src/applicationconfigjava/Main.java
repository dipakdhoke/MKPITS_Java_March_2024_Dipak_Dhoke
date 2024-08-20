package applicationconfigjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
	ApplicationContext  context = new AnnotationConfigApplicationContext(appconfig.class);
	 Student student=(Student) context.getBean("s2"); 
	 student.displaydetails();
	 
	 Student student2=(Student) context.getBean("S3"); 
	 student2.displaydetails();
	 
	}

}
