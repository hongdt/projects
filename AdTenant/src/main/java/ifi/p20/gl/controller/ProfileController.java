package ifi.p20.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import ifi.p20.gl.model.OfferInfo;

@Controller
@Transactional
@EnableWebMvc
public class ProfileController {
	@RequestMapping(value = { "/profil" }, method = RequestMethod.GET)
	public String offre(Model model) {
//		OfferInfo offerInfo = null;
//		offerInfo = new OfferInfo();
//		model.addAttribute("offerForm", offerInfo);
		return "profile";
	}
}
