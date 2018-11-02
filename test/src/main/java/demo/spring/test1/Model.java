/**
 * 
 */
package demo.spring.test1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author Dell
 *
 */
public class Model {
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void showresult() {
		System.out.println("Name :"+ name);
	}
}
