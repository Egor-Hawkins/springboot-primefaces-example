package ru.hawkins.springbootprimefacesexample;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ServletContextAware;
import ru.hawkins.springbootprimefacesexample.jsf.ViewScope;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SpringbootPrimefacesExampleApplication implements ServletContextAware {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPrimefacesExampleApplication.class, args);
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
        servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION",Boolean.TRUE.toString());
    }

    @Bean
    public FacesServlet facesServlet() {
        return new FacesServlet();
    }

    @Bean
    public ServletRegistrationBean facesServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(
                facesServlet(), "*.xhtml");
        registration.setName("FacesServlet");
        return registration;
    }

    @Bean
    public static CustomScopeConfigurer scopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        Map<String, Object> scopesMap = new HashMap<>();
        scopesMap.put("view", new ViewScope());
        configurer.setScopes(scopesMap);
        return configurer;
    }
}
