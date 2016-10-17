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
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpRequest;
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
import ifi.p20.gl.dao.CountryDAO;
import ifi.p20.gl.dao.OfferDAO;
import ifi.p20.gl.entity.Country;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;
import ifi.p20.gl.model.OfferInfo;
import ifi.p20.gl.validator.AccountInfoValidator;

@Controller
@Transactional
@EnableWebMvc
public class HomeController {
	@RequestMapping(value = { "/" })
	public String home() {
		return "home";
	}
}
