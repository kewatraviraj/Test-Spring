/**
 * 
 */
package com.springtest.service;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

/**
 * @author Dell
 *
 */
@Component
public class Display {
	/**
	 * 
	 */
	@Id
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment",strategy="increment")
	int id;
	String str;
	String str1;
	
	public Display() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	@Override
	public String toString() {
		return "Display [id=" + id + ", str=" + str + ", str1=" + str1 + "]";
	}
}	
