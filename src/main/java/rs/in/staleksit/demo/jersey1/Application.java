/**
 * 
 */
package rs.in.staleksit.demo.jersey1;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.spi.spring.container.servlet.SpringServlet;

@SpringBootApplication
@EnableEurekaClient
@ImportResource(locations = {"classpath:org/jtransfo/spring/jTransfoContext.xml"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public ServletContextInitializer servletInitializer() {
		return new ServletContextInitializer() {
			
			@Override
			public void onStartup(ServletContext servletContext) throws ServletException {
				final ServletRegistration.Dynamic appServlet = servletContext.addServlet("jersey-servlet", new SpringServlet());
				Map<String, String> filterParameters = new HashMap<>();
				// set filter parameters
		        filterParameters.put("com.sun.jersey.config.property.packages", "rs.in.staleksit.demo.jersey1");
		        appServlet.setInitParameters(filterParameters);
		        appServlet.setInitParameter(JSONConfiguration.FEATURE_POJO_MAPPING, "true");
				appServlet.setLoadOnStartup(2);
				appServlet.addMapping("/api/v1/*");
			}
		};
	}
}
