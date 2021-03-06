package c.n.z.k.invoicing.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/*
	 * @RequestMapping("/")
	 * @ResponseBody String home() { return "to index page !"; }
	 */
}