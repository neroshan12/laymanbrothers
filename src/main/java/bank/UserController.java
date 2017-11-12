package bank;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import domain.User;


@Controller
public class UserController {
	
	@GetMapping(value = "/newUser")
	public String userForm(Model model) {
		model.addAttribute("user", new User(null, null, null, null));
		return "NewUser";
	}
	@PostMapping("/newUser")
    public String newUserSubmit(@ModelAttribute User user) {
        return "user";
    }
	
	
}
