package ifi.p20.gl.controller;

import java.io.IOException;

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
public class ResultSearchController {
	@Autowired
	private OfferDAO offerDAO;
	
	@RequestMapping(value = { "/liste" })
	public String listOfferHandler(Model model, //
			@RequestParam(value = "key_word", defaultValue = "") String likeKeyWord,
			@RequestParam(value = "page", defaultValue = "1") int page) {
		final int maxResult = 5;
		final int maxNavigationPage = 10;
		System.out.println("key word : "+likeKeyWord);

		PaginationResult<OfferInfo> result = offerDAO.findOfferInfoByLocation(page, maxResult, maxNavigationPage, likeKeyWord);
		System.out.println("result "+result.getList().size());
		
		model.addAttribute("paginationOffers", result);
		return "liste";
	}
	
	@RequestMapping(value = { "/offerImage1" }, method = RequestMethod.GET)
	public void productImage(HttpServletRequest request, HttpServletResponse response, Model model,
			@RequestParam("id") String id) throws IOException {
		Offer offer = null;
		if (id != null) {
			offer = this.offerDAO.findOfferById(Integer.parseInt(id));
		}
		if (offer != null && offer.getImage1() != null) {
			response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
			response.getOutputStream().write(offer.getImage1());
		}
		response.getOutputStream().close();
	}
}
