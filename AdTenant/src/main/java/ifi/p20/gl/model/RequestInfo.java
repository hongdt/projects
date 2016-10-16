package ifi.p20.gl.model;


public class RequestInfo {
	private int id;
	private String nameAdvertise;
	private String userName;
	private float area;
	private int numberOfParts;
	private float price;
	private String country;
	private String city;
	private String street;
	private String description;
	private int status;

	public RequestInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RequestInfo(String nameAdvertise, String userName, float area, int numberOfParts, float price, String country, String city,
			String street, String description, int status) {
		super();
		this.nameAdvertise = nameAdvertise;
		this.userName = userName;
		this.area = area;
		this.numberOfParts = numberOfParts;
		this.price = price;
		this.country = country;
		this.city = city;
		this.street = street;
		this.description = description;
		this.status = status;
	}

	public String getNameAdvertise() {
		return nameAdvertise;
	}

	public void setNameAdvertise(String nameAdvertise) {
		this.nameAdvertise = nameAdvertise;
	}

	public String getUser() {
		return userName;
	}

	public void setUser(String user) {
		this.userName = user;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfParts() {
		return numberOfParts;
	}

	public void setNumberOfParts(int numberOfParts) {
		this.numberOfParts = numberOfParts;
	}

}
