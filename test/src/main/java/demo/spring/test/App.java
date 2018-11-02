package demo.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.spring.test1.Demo;
import demo.spring.test1.DemoModel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Demo test = (Demo) context.getBean("demo"); 
    	test.show();
    	test.call();
       // System.out.println( "Hello World!" );
    	
    	DemoModel test1 = (DemoModel) context.getBean("beanOne");
    	test1.show();

    	DemoModel test2 = (DemoModel) context.getBean("beanOne");
    	test2.show();
    	
    }
}
