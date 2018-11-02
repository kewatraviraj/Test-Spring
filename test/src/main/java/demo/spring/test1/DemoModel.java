/**
 * 
 */
package demo.spring.test1;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author Dell
 *
 */
public class DemoModel {
	int id;
	String name;
	String mname;
	Map<String, String> someMap;
	List<Map<String, String>> list;
	Set<String> someset;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	@Required
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 */
	public DemoModel() {
		// TODO Auto-generated constructor stub
		System.out.println("demomodel constr");
	}

	public DemoModel(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("constr demomodel");
		this.name = name;
	}

	public DemoModel(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	
	
	public void demoModel() {
			System.out.println(name);
	      System.out.println("Inside demoModel." );
	}
	
	public void show() {
		System.out.println(id + " " + name);
	}

	public void print() {
		System.out.println(name + "" + id);
		System.out.println(mname);

		Iterator<Map<String, String>> itr1 = list.iterator();
		while (itr1.hasNext()) {
			Set<Entry<String, String>> set = itr1.next().entrySet();
			Iterator<Entry<String, String>> itr = set.iterator();
			while (itr.hasNext()) {
				Entry<String, String> entry = itr.next();
				System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
			}
		}
		Iterator<String> itr4 = someset.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
	}

	public void listmapshow() {
	Iterator<Map<String, String>> itr1 = list.iterator();
		while (itr1.hasNext()) {
			Iterator<Entry<String, String>> set = itr1.next().entrySet().iterator();
			while (set.hasNext()) {
				Entry<String, String> entry = set.next();
				System.out.println("Answer:" + entry.getKey() + " Posted By:" + entry.getValue());
			}
		}
	}

	public Map<String, String> getSomeMap() {
		return someMap;
	}

	public void setSomeMap(Map<String, String> someMap) {
		this.someMap = someMap;
	}

	public List<Map<String, String>> getList() {
		return list;
	}

	public void setList(List<Map<String, String>> list) {
		this.list = list;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Set<String> getSomeset() {
		return someset;
	}

	public void setSomeset(Set<String> someset) {
		this.someset = someset;
	}
}
