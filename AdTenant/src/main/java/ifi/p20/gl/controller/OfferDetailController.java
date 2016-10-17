package ifi.p20.gl.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import ifi.p20.gl.dao.OfferDAO;
import ifi.p20.gl.entity.Offer;
import ifi.p20.gl.model.OfferInfo;
import ifi.p20.gl.utils.PaginationResult;

@Controller
@Transactional
@EnableWebMvc
public class OfferDetailController {
	@Autowired
	private OfferDAO offerDAO;
	
	@RequestMapping(value = { "/detail" }, method = RequestMethod.GET)
	public String offerViewDetail(Model model, @RequestParam("id") String id) {
		OfferInfo offerInfo = null;
		if (id != null) {
			offerInfo = this.offerDAO.findOfferInfoById(Integer.parseInt(id));
		}
		if (offerInfo == null) {
			return "redirect:/";
		}

		model.addAttribute("offerInfo", offerInfo);

		return "detail";
	}
	
	@RequestMapping(value = { "/detail?contact" })
	public String contact() {
		return "home";
	}
	
	@RequestMapping(value = { "/offerImage1" }, method = RequestMethod.GET)
	public void offerImage1(HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("id") String id) throws IOException {
		Offer offer = null;
		System.out.println("id detail = "+id);
		if (id != null) {
			offer = this.offerDAO.findOfferById(Integer.parseInt(id));
		}
		if (offer != null && offer.getImage1() != null) {
			response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
			response.getOutputStream().write(offer.getImage1());
		}
		response.getOutputStream().close();
	}
	
	@RequestMapping(value = { "/offerImage2" }, method = RequestMethod.GET)
	public void offerImage2(HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("id") String id) throws IOException {
		Offer offer = null;
		if (id != null) {
			offer = this.offerDAO.findOfferById(Integer.parseInt(id));
		}
		if (offer != null && offer.getImage2() != null) {
			response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
			response.getOutputStream().write(offer.getImage2());
		}
		response.getOutputStream().close();
	}
	
	@RequestMapping(value = { "/offerImage3" }, method = RequestMethod.GET)
	public void offerImage3(HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("id") String id) throws IOException {
		Offer offer = null;
		if (id != null) {
			offer = this.offerDAO.findOfferById(Integer.parseInt(id));
		}
		if (offer != null && offer.getImage3() != null) {
			response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
			response.getOutputStream().write(offer.getImage3());
		}
		response.getOutputStream().close();
	}
}
