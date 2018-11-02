/**
 * 
 */
package com.springtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springtest.service.Display;

/**
 * @author Dell
 *
 */
@Controller
@RequestMapping("/")
public class SpringController {
	
	/*@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}*/
	@Autowired
	Display display;
	
	@RequestMapping("/t")
	public String say(@ModelAttribute Display display, ModelMap model) {
		
		model.addAttribute("greeting", display +"to Hello World from Spring MVC");
		System.out.println("Calling" + display);
		return "welcome";
	}
	 @RequestMapping(value = "/test", method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
		 	System.out.println("Called");
	        return "welcome";
	    }
	 
}
