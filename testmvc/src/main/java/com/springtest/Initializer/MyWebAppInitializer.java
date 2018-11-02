/**
 * 
 */
package com.springtest.Initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springtest.configuration.TestConfiguration;

/**
 * @author Dell
 *
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { TestConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class<?>[] { };
   }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
