package bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bank.domain.CurrentAccount;
import bank.domain.SavingsAccount;
import bank.domain.Transaction;
import bank.domain.User;
import bank.services.AccountService;
import bank.services.UserService;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@Controller
public class AccountController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/balance")
	public String users(Model model) {
		User user = userService.findById(1);
		SavingsAccount savingsAccount = user.getSavingsAccount();
		CurrentAccount currentAccount = user.getCurrentAccount();
		
		model.addAttribute("user", user);
		model.addAttribute("savingsAccount", savingsAccount);
		model.addAttribute("currentAccount", currentAccount);
		return "balance";
	}
	
	@RequestMapping(value = "/accounts")
	public String accounts(Model model) {
		User user = userService.findById(1);
		model.addAttribute("user", user);
		return "accounts";
	}
	
	@RequestMapping(value = "/deposit")
	public String deposits(Model model) {
		User user = userService.findById(1);
		model.addAttribute("user", user);
		return "deposit";
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public String deposit(@ModelAttribute("amount") int amount) {
		User user = userService.findById(1);
		user.currentAccount.deposit(amount);
		return "redirect:/balance";
	}
	
	@RequestMapping(value = "/withdraw")
	public String withdraws(Model model) {
		User user = userService.findById(1);
		model.addAttribute("user", user);
		return "withdraw";
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public String withdraw(@ModelAttribute("withdraw") int amount) {
		User user = userService.findById(1);
		user.currentAccount.withdraw(amount);
		return "redirect:/balance";
	}
	
	@RequestMapping(value = "/transactions")
	public String transactions(Model model) {
		User user = userService.findById(1);
		model.addAttribute("user", user);
		return "transactions";
	}
	

}