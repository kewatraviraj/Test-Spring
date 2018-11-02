/**
 * 
 */
package demo.spring.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;

/**
 * @author Dell
 *
 */
public class Demo {
	
	private int id;
	private String name;
	private DemoModel beanOne;
	
	public void call() {
		beanOne.demoModel();
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}  

	/**
	 * 
	 */
	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("definn constructor Demo");
	}
 
	public Demo(int id) {this.id = id;}  
	  
	public Demo(String name) {  this.name = name;}  
	  
	public Demo(int id, String name) {  
	    this.id = id;  
	    this.name = name;  
	}  
	  
	public void show(){  
	    System.out.println(id+" "+name);  
	}

	public DemoModel getDemomodel() {
		return beanOne;
	}
	
	@Autowired
	@Qualifier("demomodel")
	public void setDemomodel(@Nullable DemoModel demomodel) {
		this.beanOne = demomodel;
	}
	

}
