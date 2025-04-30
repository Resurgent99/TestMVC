package org.mvc.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInit extends
    AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?> [] getRootConfigClasses() {
    return null;
  }

  @Override
  protected Class<?>  [] getServletConfigClasses() {
    return new Class[] { SpringConfiguration.class };
  }

  @Override
  protected String[] getServletMappings() {
    return new String[] {"/"};
  }
}
