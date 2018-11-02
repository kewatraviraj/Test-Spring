/**
 * 
 */
package ne.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @author Dell
 *
 */
@Repository
public class JpaMovieFinder implements MovieFinder {

	/* (non-Javadoc)
	 * @see ne.test.MovieFinder#show()
	 */
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Movie Find");
		
	}

}
