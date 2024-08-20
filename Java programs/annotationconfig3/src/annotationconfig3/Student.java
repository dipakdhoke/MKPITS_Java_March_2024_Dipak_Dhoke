package annotationconfig3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component                                        //it is component which is search by componentscan(under App.config)
@PropertySource("classpath:application.properties")  //declaring path of file(application.properties)  where data get get read 
public class Student {
	@Value("${name}")
	private String name;
	
	@Value("${city}")
	private String city;
	
	
	public Student() {
	}

	public Student(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public void displaydetails() {
	System.out.println(name+" "+city);
	}
}
