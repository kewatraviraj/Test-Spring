/**
 * 
 */
package ne.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dell
 *
 */
@Service
public class SimpleMovieLister {
	private MovieFinder movieFinder;
	
	@Autowired
	public SimpleMovieLister(MovieFinder movieFinder) {
		this.movieFinder = movieFinder;
	}
	
	public void find() {
		movieFinder.show();
	}
}
