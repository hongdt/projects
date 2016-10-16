package ifi.p20.gl.dao;


import ifi.p20.gl.entity.User;
import ifi.p20.gl.model.AccountInfo;

public interface AccountDAO {
	public User findAccount(String email);
	public void save(AccountInfo accountInfo);
}
