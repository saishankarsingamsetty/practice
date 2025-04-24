package valueAttribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("example")
public class ValueAttribute {

	@Value("${person.name}")
	String name;
	@Value("${person.age}")
	String age;
	@Value("222")
	int id;
	
	@Override
	public String toString() {
		return "ValueAttribute [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	
}
