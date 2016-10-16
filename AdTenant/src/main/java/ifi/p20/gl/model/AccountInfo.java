package ifi.p20.gl.model;

public class AccountInfo {
	private String email;
	private String password;
	private String rePassword;
	private boolean isActive;

	public AccountInfo(String email, String password, boolean isActive) {
		super();
		this.email = email;
		this.password = password;
		this.isActive = isActive;
	}

	public AccountInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

}
