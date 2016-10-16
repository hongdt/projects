package ifi.p20.gl.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;
import ifi.p20.gl.validator.AccountInfoValidator;

@Controller
@Transactional
@EnableWebMvc
public class LoginController {

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

	@RequestMapping(value = { "/connexion" }, method = RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
}
