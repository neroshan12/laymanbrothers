package bank.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bank.domain.User;
import bank.services.UserService;

@Controller
public class UserController {

	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value = "/newUser")
	public String userForm() {
		return "newUser";
	}

	
	@RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public String newUserSubmit(User user) {
		userService.saveOrUpdate(user);
        return "redirect:/user";
    }
	
	@RequestMapping(value = "/user")
	public String helloUser(Model model) {
		model.addAttribute("user", userService.findByUsername("dick"));
		return "user";
	}
	
}
