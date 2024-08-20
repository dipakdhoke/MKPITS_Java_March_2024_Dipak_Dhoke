package applicationconfigjava;


import org.springframework.context.annotation.Bean;

public class appconfig {
	
	@Bean 
	public Student s2() {
	Student student= new Student();
	student.setName("Dipak");
	student.setCity("Nagpur");
	return student;
	}

	
   @Bean
   public Student S3() {
	   Student student2=new Student();
	   student2.setName("Rakesh");
	   student2.setCity("Alaska");
	   return student2;
	   
   }
}