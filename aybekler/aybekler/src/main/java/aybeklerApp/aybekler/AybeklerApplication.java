package aybeklerApp.aybekler;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import aybeklerApp.aybekler.entities.concretes.HomeTable;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class AybeklerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AybeklerApplication.class, args);
		/* Home Table Test */
		
		
		
		
	}

	                               
	    @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("aybeklerApp.aybekler"))                                      
	          .build();                                           
	    
	}
}
