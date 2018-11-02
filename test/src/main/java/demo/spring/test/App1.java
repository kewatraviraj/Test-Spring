/**
 * 
 */
package demo.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.test1.Demo;
import demo.spring.test1.DemoModel;

/**
 * @author Dell
 *
 */
public class App1 {
	
	public static void main(String[] a ) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		DemoModel demomodel = (DemoModel) context.getBean("beanOne");
		
		demomodel.print();
		demomodel.listmapshow();
		
	}
}
