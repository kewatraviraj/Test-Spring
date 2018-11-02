/**
 * 
 */
package demo.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.test1.MethodInjection;
import ne.test.Place;

/**
 * @author Dell
 *
 */
public class App4 {
	public static void main(String [] a) {

    	ApplicationContext context = new ClassPathXmlApplicationContext("source.xml");
    	
    	MethodInjection test = (MethodInjection) context.getBean("singleton");
    	test.findToken();
    	test.findToken();
    	System.out.println(test.hashCode());
    	
    	MethodInjection tes = (MethodInjection) context.getBean("singleton");
    	System.out.println(tes.hashCode());
    	
    	
    	/*Place test = (Place) context.getBean("dataSource");
    	test.propshow();*/
	}
}
