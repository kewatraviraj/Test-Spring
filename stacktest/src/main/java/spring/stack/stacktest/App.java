package spring.stack.stacktest;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.stack.stack.StackCreate;


public class App 
{
    public static void main( String[] args ){
    	 
    	ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        
    	 Scanner scan = new Scanner(System.in);        
         System.out.println("Enter Size of Stack ");
         int num = scan.nextInt();
         
         StackCreate stk = (StackCreate) context.getBean("stack");
         stk.createStack(num);
       while(true) {  
        System.out.println("Select Operation :");
 		System.out.println("1.Add to Stack");
 		System.out.println("2.Remove from Stack");
 		
 		switch(scan.nextInt()) {
 		case 1:
 			System.out.println("Enter Element :");
 			stk.push(scan.nextInt());
 			break;
 		case 2:
 			/*System.out.println("Enter the index of element from where to remove :");
 			int Toindex = scan.nextInt();
 			*/
 			stk.pop();
 			System.out.println("element is deleted");	
 			break;
 		}
       }
 		
    }
}
