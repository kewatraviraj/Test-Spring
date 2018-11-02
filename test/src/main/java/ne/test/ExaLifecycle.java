/**
 * 
 */
package ne.test;

import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
/**
 * @author Dell
 *
 */
public class ExaLifecycle implements InitializingBean {

    public void afterPropertiesSet() {
        // do some initialization work
    	System.out.println("calling");
    }
    
    public void init() {
    	System.out.println("init");
    }
    @PostConstruct
    public void startup() {
    	System.out.println("stratup");
    }
}
