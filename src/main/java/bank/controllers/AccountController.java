package bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bank.domain.CurrentAccount;
import bank.domain.Transaction;
import bank.domain.User;
import bank.domain.Bank;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})

@Controller
public class AccountController {
		
	User accountWill = new User("Will", "Cabangon", "will@will.com", "will_will");
			
//	CurrentAccount accountWill = new CurrentAccount(0);
//	CurrentAccount accountJoe = new CurrentAccount(0);
//	CurrentAccount accountKeith = new CurrentAccount(0);
//	CurrentAccount accountMarcus = new CurrentAccount(0);
//	CurrentAccount accountEtienne = new CurrentAccount(0);
//	CurrentAccount accountNero = new CurrentAccount(0);

	@RequestMapping(value = "/balance")
	public String users(Model model) {
//		accountWill.openCurrentAccount();
		model.addAttribute("user", accountWill);
		return "balance";
	}
	
	@RequestMapping(value = "/accounts")
	public String accounts(Model model) {
		model.addAttribute("user", accountWill);
		return "accounts";
	}
	
	@RequestMapping(value = "/deposit")
	public String deposits(Model model) {
		model.addAttribute("user", accountWill);
		return "deposit";
	}
	
	@RequestMapping(value = "/deposit", method = RequestMethod.POST)
	public String deposit(@ModelAttribute("amount") int amount) {
		accountWill.currentAccount.deposit(amount);
		return "redirect:/balance";
	}
	
	@RequestMapping(value = "/withdraw")
	public String withdraws(Model model) {
		model.addAttribute("user", accountWill);
		return "withdraw";
	}
	
	@RequestMapping(value = "/withdraw", method = RequestMethod.POST)
	public String withdraw(@ModelAttribute("withdraw") int amount) {
		accountWill.currentAccount.withdraw(amount);
		return "redirect:/balance";
	}
	
	@RequestMapping(value = "/transactions")
	public String transactions(Model model) {
		model.addAttribute("user", accountWill);
		return "transactions";
	}
	
//	@RequestMapping(value = "/admin")
//	public String admin(Model model) {
//		model.addAttribute("accounts", accountWill);
//		model.addAttribute("accounts1", accountJoe);
//		model.addAttribute("accounts2", accountKeith);
//		model.addAttribute("accounts3", accountMarcus);
//		model.addAttribute("accounts4", accountEtienne);
//		model.addAttribute("accounts5", accountNero);
//
//		return "admin";
//	}
//	
}