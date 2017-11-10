package bank;

import org.springframework.stereotype.Controller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@Controller
public class WelcomeController {
	@RequestMapping("/homepage")
	public String initialize() {
		return "homepage";
	}
}