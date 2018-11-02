/**
 * 
 */
package demo.spring.test1;

/**
 * @author Dell
 *
 */
public abstract class MethodInjection {
	 
		 public void findToken(){
		  System.out.println("Token has been generated "+generateToken().hashCode());
		 }
		 public abstract Token generateToken();
		 
}
