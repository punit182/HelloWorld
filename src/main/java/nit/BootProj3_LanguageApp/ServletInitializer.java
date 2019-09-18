package nit.BootProj3_LanguageApp;


import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {

	
	
	ServletInitializer()
	{
		 super();
		    setRegisterErrorPageFilter(false); 
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BootProj3LanguageAppApplication.class);
	}

}
