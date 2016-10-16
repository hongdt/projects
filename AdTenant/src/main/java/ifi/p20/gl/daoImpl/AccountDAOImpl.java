package ifi.p20.gl.daoImpl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import ifi.p20.gl.dao.AccountDAO;
import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;

@Transactional
@Component
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public User findAccount(String email) {
		System.out.println("Email " + email);
		Session session = sessionFactory.getCurrentSession();
		Criteria crit = session.createCriteria(User.class);
		crit.add(Restrictions.eq("email", email));
		return (User) crit.uniqueResult();
	}

	@Override
	public void save(AccountInfo accountInfo) {
		User account = null;

		account = new User();
		account.setEmail(accountInfo.getEmail());
		String pass = passwordEncoder.encode(accountInfo.getPassword());
		account.setPassword(pass);
		System.out.println("Pass encode "+pass);
		account.setActive(true);

		this.sessionFactory.getCurrentSession().persist(account);
		// If error in DB, Exceptions will be thrown out immediately
		this.sessionFactory.getCurrentSession().flush();
	}
}