package ir.kasri.hazardmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class HazardMapApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder HazardMapApplication) {
		return HazardMapApplication.sources(HazardMapApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(HazardMapApplication.class, args);
	}

}
