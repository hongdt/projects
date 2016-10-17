package ifi.p20.gl.daoImpl;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ifi.p20.gl.dao.AccountDAO;
import ifi.p20.gl.dao.OfferDAO;
import ifi.p20.gl.entity.Country;
import ifi.p20.gl.entity.Offer;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.OfferInfo;
import ifi.p20.gl.utils.HandlerSession;
import ifi.p20.gl.utils.PaginationResult;

//Transactional for Hibernate
@Transactional
@Component
public class OfferDAOImpl implements OfferDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private AccountDAO accountDAO;

	@Override
	public Offer findOfferByLocation(String location) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Offer.class);
		crit.add(Restrictions.eq("city", location));
		return (Offer) crit.uniqueResult();
	}

	@Override
	public OfferInfo findOfferInfoByLocation(String location) {
		Offer offer = this.findOfferByLocation(location);
		if (offer == null) {
			return null;
		}
		return new OfferInfo(offer.getId(), offer.getName(), offer.getUser().getId(), offer.getUser().getEmail(), offer.getArea(), offer.getNumber_of_parts(),
				offer.getPrice(), offer.getCountry(), offer.getCity(), offer.getStreet(), offer.getDescription(),
				offer.getStatus(), offer.getDate());
	}

	@Override
	public Offer findOfferById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(Offer.class);
		crit.add(Restrictions.eq("id", id));
		return (Offer) crit.uniqueResult();
	}

	@Override
	public OfferInfo findOfferInfoById(int id) {
		Offer offer = this.findOfferById(id);
		if (offer == null) {
			return null;
		}
		return new OfferInfo(offer.getId(), offer.getName(), offer.getUser().getId(), offer.getUser().getEmail(), offer.getArea(), offer.getNumber_of_parts(),
				offer.getPrice(), offer.getCountry(), offer.getCity(), offer.getStreet(), offer.getDescription(),
				offer.getStatus(), offer.getDate());
	}

	@Override
	public void save(OfferInfo offerInfo) {
		Offer offer = null;
		//
		// boolean isNew = false;
		//
		//
		// if (id > 0) {
		// offer = this.findOfferById(id);
		// }
		if (offer == null) {
			// isNew = true;
			offer = new Offer();
			offer.setDate(new Date());
			System.out.println("Date : " + offer.getDate());
		}

		offer.setName(offerInfo.getNameAdvertise());
		System.out.println("Name Ad : " + offerInfo.getNameAdvertise());

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		UserDetails userDetails = HandlerSession.currentUserDetails();
		User user = accountDAO.findAccount(userDetails.getUsername());
		System.out.println("Name user : " + userDetails.getUsername());
		offer.setUser(user);

		offer.setArea(offerInfo.getArea());
		System.out.println("Area : " + offerInfo.getArea());

		offer.setNumber_of_parts(offerInfo.getNumberOfParts());

		offer.setPrice(offerInfo.getPrice());
		System.out.println("Price : " + offerInfo.getPrice());

		offer.setCountry(offerInfo.getCountry());
		System.out.println("Country : " + offerInfo.getCountry());

		offer.setCity(offerInfo.getCity());
		System.out.println("City : " + offerInfo.getCity());

		offer.setStreet(offerInfo.getStreet());
		System.out.println("Street : " + offerInfo.getCity());

		offer.setDescription(offerInfo.getDescription());
		System.out.println("Description : " + offerInfo.getDescription());

		offer.setStatus(offerInfo.getStatus());
		System.out.println("Status : " + offerInfo.getStatus());

		if (offerInfo.getImage1() != null) {
			byte[] image = offerInfo.getImage1().getBytes();
			if (image != null && image.length > 0) {
				offer.setImage1(image);
			}
			System.out.println("Img1 : " + offerInfo.getImage1().getBytes());
		}

		if (offerInfo.getImage2() != null) {
			byte[] image = offerInfo.getImage2().getBytes();
			if (image != null && image.length > 0) {
				offer.setImage2(image);
			}
			System.out.println("Img2 : " + offerInfo.getImage2().getBytes());
		}

		if (offerInfo.getImage3() != null) {
			byte[] image = offerInfo.getImage3().getBytes();
			if (image != null && image.length > 0) {
				offer.setImage3(image);
			}
			System.out.println("Img3 : " + offerInfo.getImage3().getBytes());
		}
		// if (isNew) {
		this.sessionFactory.getCurrentSession().persist(offer);
		// }
		// If error in DB, Exceptions will be thrown out immediately
		// Nếu có lỗi tại DB, ngoại lệ sẽ ném ra ngay lập tức
		this.sessionFactory.getCurrentSession().flush();
	}

	public PaginationResult<OfferInfo> findOfferInfoByLocation(int page, int maxResult, int maxNavigationPage,
			String likeKeyWord) {
		String sql = "Select new " + OfferInfo.class.getName() //
				+ "(o.id, o.user.id, o.name, o.price, o.area, o.number_of_parts, o.country, o.city, o.street, o.description, o.date, o.status) " + " from "//
				+ Offer.class.getName() + " o ";
		if (likeKeyWord != null && likeKeyWord.length() > 0) {
			sql += " Where lower(o.country) like :likeKeyWord or lower(o.city) like :likeKeyWord or lower(o.street) like :likeKeyWord";
		}
		sql += " order by o.date desc ";
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery(sql);
		if (likeKeyWord != null && likeKeyWord.length() > 0) {
			query.setParameter("likeKeyWord", "%" + likeKeyWord.toLowerCase() + "%");
		}
		return new PaginationResult<OfferInfo>(query, page, maxResult, maxNavigationPage);
	}

}
