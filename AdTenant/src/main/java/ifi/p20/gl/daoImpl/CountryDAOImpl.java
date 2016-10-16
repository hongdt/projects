package ifi.p20.gl.daoImpl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ifi.p20.gl.dao.CountryDAO;
import ifi.p20.gl.entity.Country;

@Transactional
@Component
public class CountryDAOImpl implements CountryDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public ArrayList<Country> findAllCountry() {
		return (ArrayList<Country>) sessionFactory.getCurrentSession().createCriteria(Country.class).list();
	}
}
