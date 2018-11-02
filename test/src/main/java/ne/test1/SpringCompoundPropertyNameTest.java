/**
 * 
 */
package ne.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ne.test.Bob;
import ne.test.Foo;

/**
 * @author Dell
 *
 */
public class SpringCompoundPropertyNameTest {

	    public static void main(String[] a) {
	        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("source.xml");
	       /* Foo foo = (Foo) applicationContext.getBean("compoundPropertyName");
	        Bob bob = (Bob) applicationContext.getBean("compound");
	                 
	        System.out.println(bob.getJhon());
	        
	        System.out.println(foo.getFred().getBob().getJhon());*/
	        
	        applicationContext.getBean("exampleInitBean");
	        
	    }
}
