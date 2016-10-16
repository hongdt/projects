package ifi.p20.gl.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import ifi.p20.gl.dao.AccountDAO;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;

@Component
public class AccountInfoValidator implements Validator {

	@Autowired
	private AccountDAO accountDAO;

	@Override
	public boolean supports(Class<?> paramClass) {
		return AccountInfo.class.equals(paramClass);
	}

	@Override
	public void validate(Object target, Errors errors) {
		AccountInfo accInfo = (AccountInfo) target;
		System.out.println("acc validator email=" + accInfo.getEmail());

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.accountForm.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.accountForm.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rePassword", "NotEmpty.accountForm.rePassword");

		if (!accInfo.getPassword().equals(accInfo.getRePassword())) {
			errors.rejectValue("password", "Different.accountForm.rePassword");
		}

		if (accInfo.getPassword().length() != 0) {
			if (accInfo.getPassword().length() < 6 || accInfo.getPassword().length() > 15) {
				errors.rejectValue("password", "Size.accountForm.password");
			}
		}

		if (accInfo.getRePassword().length() != 0) {
			if (accInfo.getRePassword().length() < 6 || accInfo.getRePassword().length() > 15) {
				errors.rejectValue("rePassword", "Size.accountForm.rePassword");
			}
		}

		if (accInfo.getEmail().length() != 0) {
			if (!accInfo.getEmail().matches(
					"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				errors.rejectValue("email", "Email.accountForm.email");
			} else {
				User user = accountDAO.findAccount(accInfo.getEmail());
				if (user != null) {
					errors.rejectValue("email", "Exist.accountForm.email");
				}
			}
		}
	}

}
