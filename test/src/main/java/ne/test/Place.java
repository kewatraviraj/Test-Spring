/**
 * 
 */
package ne.test;

/**
 * @author Dell
 *
 */
public class Place {
	
	String driverClassname;
	String url;
	String username;
	String password;
	public String getDriverClassname() {
		return driverClassname;
	}
	public void setDriverClassname(String driverClassname) {
		this.driverClassname = driverClassname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void propshow() {
		System.out.println(driverClassname + url + username + password);
	}
}
