/**
 * 
 */
package demo.spring.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import demo.spring.test1.MovieCatalog;

/**
 * @author Dell
 *
 */
public class MovieRecommender {

    @Autowired
    @MovieCatalog("action")
    private Movie name;
    
/*    private MovieCatalog actionCatalog;
    
    private MovieCatalog comedyCatalog;
*/
    public Movie getName() {
		return name;
	}
	public void setName(Movie name) {
		this.name = name;
	}

 /*   @Autowired
    public void setComedyCatalog(@MovieCatalog("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }*/
}