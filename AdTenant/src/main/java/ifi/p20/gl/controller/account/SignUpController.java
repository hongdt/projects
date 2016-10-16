package ifi.p20.gl.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ifi.p20.gl.dao.AccountDAO;
import ifi.p20.gl.model.AccountInfo;
import ifi.p20.gl.validator.AccountInfoValidator;

@Controller
@Transactional
@EnableWebMvc
public class SignUpController {

	@Autowired
	private AccountInfoValidator accountInfoValidator;

	public AccountInfoValidator getAccountInfoValidator() {
		return accountInfoValidator;
	}

	public void setAccountInfoValidator(AccountInfoValidator accountInfoValidator) {
		this.accountInfoValidator = accountInfoValidator;
	}

	@Autowired
	private AccountDAO accountDAO;

	@Autowired
	private ResourceBundleMessageSource messageSource;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		Object target = dataBinder.getTarget();
		if (target == null) {
			return;
		}
		System.out.println("Target=" + target);
		if (target.getClass() == AccountInfo.class) {
			dataBinder.setValidator(accountInfoValidator);
		}

	}

	@RequestMapping(value = { "/inscription" }, method = RequestMethod.GET)
	public String signup(Model model) {
		AccountInfo accountInfo = null;
		accountInfo = new AccountInfo();
		model.addAttribute("accountForm", accountInfo);
		return "signup";
	}

	@RequestMapping(value = { "/inscription"}, method = RequestMethod.POST)
	// Avoid UnexpectedRollbackException
	@Transactional(propagation = Propagation.NEVER)
	public String saveAccount(Model model, @ModelAttribute("accountForm") @Validated AccountInfo accountInfo,
			BindingResult result, final RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			System.out.println("Error " + result.getFieldError().toString());
			return "signup";
		}
		try {
			accountDAO.save(accountInfo);
		} catch (Exception e) {
			String message = e.getMessage();
			model.addAttribute("message", message);
			return "signup";

		}
		return "redirect:/";
	}
}
