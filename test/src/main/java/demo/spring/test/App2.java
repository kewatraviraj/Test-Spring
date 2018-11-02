/**
 * 
 */
package demo.spring.test;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import demo.spring.test1.Model;
import demo.spring.test1.MovieRecommender;

/**
 * @author Dell
 *
 */
@Configuration
public class App2 {
	
	@Bean
	public Model model(){
		System.out.println("First");
		return new Model();
	}
	
	public static void main(String[] a) {
	/*	GenericApplicationContext context = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context).loadBeanDefinitions("beans.xml");
	 	context.refresh();
	*/
		/* AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		    ctx.scan("demo.spring.test");
		    ctx.refresh();
		    Model myService = ctx.getBean(Model.class);
		    myService.showresult();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
		MovieRecommender movie = (MovieRecommender) context.getBean("movieRecommender");
		System.out.println(movie.getName().getName());
	}	
}
