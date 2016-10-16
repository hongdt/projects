package ifi.p20.gl.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ifi.p20.gl.dao.AccountDAO;
import ifi.p20.gl.dao.CountryDAO;
import ifi.p20.gl.dao.RequestDAO;
import ifi.p20.gl.entity.Country;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;
import ifi.p20.gl.model.RequestInfo;
import ifi.p20.gl.validator.AccountInfoValidator;

@Controller
@Transactional
@EnableWebMvc
public class RequestController {
	@Autowired
	private RequestDAO requestDAO;
//	@Autowired
//	private CountryDAO countryDAO;

	@RequestMapping(value = { "/demande" }, method = RequestMethod.GET)
	public String offre(Model model) {
		RequestInfo requestInfo = null;
		requestInfo = new RequestInfo();
		model.addAttribute("requestForm", requestInfo);
		return "request";
	}

	@RequestMapping(value = { "/demande" }, method = RequestMethod.POST)
	// Avoid UnexpectedRollbackException
	@Transactional(propagation = Propagation.NEVER)
	public String saverequest(Model model, @ModelAttribute("requestForm") @Validated RequestInfo requestInfo,
			BindingResult result, final RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			System.out.println("Error " + result.getFieldError().toString());
			return "request";
		}
		try {
			requestDAO.save(requestInfo);
		} catch (Exception e) {
			System.out.println("Error 2");
			String message = e.getMessage();
			model.addAttribute("message", message);
			return "request";

		}
		return "redirect:/";
	}

//	protected Map referenceData(HttpServletRequest request) throws Exception {
//		System.out.println("Country list");
//		Map referenceData = new HashMap();
//		Map<String, String> country = new LinkedHashMap<String, String>();
//		ArrayList<Country> countries = countryDAO.findAllCountry();
//		int size = countries.size();
//		for (int i = 0; i < size; i++) {
//			System.out.println(countries.get(i).getSortname() + " " + countries.get(i).getName());
//			country.put(countries.get(i).getSortname(), countries.get(i).getName());
//		}
//		referenceData.put("countryList", country);
//		return referenceData;
//	}
}
