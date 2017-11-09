package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import domain.Account;

@Controller
@RequestMapping("/accounts")
public class AccountController {

	@RequestMapping("/balance")
	public String showBalance(Model model) {
		Account account = new Account("Will", 1000);
		model.addAttribute("account", account);
		return "account/balance";
	}
	
}
