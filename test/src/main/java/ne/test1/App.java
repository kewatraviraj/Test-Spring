/**
 * 
 */
package ne.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ne.test.JpaMovieFinder;
import ne.test.MovieFinder;
import ne.test.SimpleMovieLister;

/**
 * @author Dell
 *
 */
public class App {
	
	public static void main(String a[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleMovieLister component = context.getBean(SimpleMovieLister.class);
        component.find();
	}
}
