package nit.BootProj3_LanguageApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMvcAppConfig;

@SpringBootApplication
@Import(value={WebMvcAppConfig.class,RootAppConfig.class})
public class BootProj3LanguageAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProj3LanguageAppApplication.class, args);
	}

}
