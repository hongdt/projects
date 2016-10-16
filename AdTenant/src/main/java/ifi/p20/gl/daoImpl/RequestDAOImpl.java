package ifi.p20.gl.daoImpl;

import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Criteria;
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
import ifi.p20.gl.dao.RequestDAO;
import ifi.p20.gl.entity.Country;
import ifi.p20.gl.entity.Offer;
import ifi.p20.gl.entity.Request;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.RequestInfo;
import ifi.p20.gl.utils.HandlerSession;
import ifi.p20.gl.utils.PaginationResult;

//Transactional for Hibernate
@Transactional
@Component
public class RequestDAOImpl implements RequestDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private AccountDAO accountDAO;

	@Override
	public void save(RequestInfo requestInfo) {
		Request request = null;
		if (request == null) {
			request = new Request();
			request.setDate(new Date());
			System.out.println("Date : " + request.getDate());
		}

		request.setName(requestInfo.getNameAdvertise());
		System.out.println("Name Ad : " + requestInfo.getNameAdvertise());

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		UserDetails userDetails = HandlerSession.currentUserDetails();
		User user = accountDAO.findAccount(userDetails.getUsername());
		System.out.println("Name user : " + userDetails.getUsername());
		request.setUser(user);

		request.setArea(requestInfo.getArea());
		System.out.println("Area : " + requestInfo.getArea());
		
		request.setNumber_of_parts(requestInfo.getNumberOfParts());

		request.setPrice(requestInfo.getPrice());
		System.out.println("Price : " + requestInfo.getPrice());

		request.setCountry(requestInfo.getCountry());
		System.out.println("Country : " + requestInfo.getCountry());

		request.setCity(requestInfo.getCity());
		System.out.println("City : " + requestInfo.getCity());

		request.setStreet(requestInfo.getStreet());
		System.out.println("Street : " + requestInfo.getCity());

		request.setDescription(requestInfo.getDescription());
		System.out.println("Description : " + requestInfo.getDescription());

		request.setStatus(requestInfo.getStatus());
		System.out.println("Status : " + requestInfo.getStatus());

		this.sessionFactory.getCurrentSession().persist(request);
		// If error in DB, Exceptions will be thrown out immediately
		// Nếu có lỗi tại DB, ngoại lệ sẽ ném ra ngay lập tức
		this.sessionFactory.getCurrentSession().flush();
	}
}
