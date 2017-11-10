package bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import domain.Account;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})


@Controller
public class AccountController {
	
	
	Account accountWill = new Account("Will", 0);
	
	@RequestMapping(value = "/balance")
	public String accounts(Model model) {
		model.addAttribute("accounts", accountWill);
		return "balance";
	}
	
	
	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public String deposit(@ModelAttribute("amount") int amount) {
		accountWill.deposit(amount);
		return "redirect:/balance";
	
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public String withdraw(@ModelAttribute("withdraw") int amount) {
		accountWill.withdraw(amount);
		return "redirect:/balance";
	}
	
	@RequestMapping(value = "/deposit")
	public String deposits(Model model) {
		model.addAttribute("accounts", accountWill);
		return "deposit";
	}
	
	@RequestMapping(value = "/withdraw")
	public String withdraws(Model model) {
		model.addAttribute("accounts", accountWill);
		return "withdraw";
	}
}
