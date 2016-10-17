package ifi.p20.gl.model;

import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class OfferInfo {
	private int id;
	private String nameAdvertise;
	private int userId;
	private float area;
	private int numberOfParts;
	private float price;
	private String country;
	private String city;
	private String street;
	private Date date;
	private CommonsMultipartFile image1;
	private CommonsMultipartFile image2;
	private CommonsMultipartFile image3;
	private String description;
	
	private int status;

	public OfferInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfferInfo(int id, int userId, String nameAdvertise, float price, float area, int numberOfParts,
			String country, String city, String street, String description, Date date, int status) {
		super();
		this.id = id;
		this.nameAdvertise = nameAdvertise;
		this.userId = userId;
		this.area = area;
		this.numberOfParts = numberOfParts;
		this.price = price;
		this.country = country;
		this.city = city;
		this.street = street;
		this.date = date;
		this.description = description;
		this.status = status;
	}



	public OfferInfo(String nameAdvertise, int userId, float area, int numberOfParts, float price, String country, String city,
			String street, String description, int status) {
		super();
		this.nameAdvertise = nameAdvertise;
		this.userId = userId;
		this.area = area;
		this.setNumberOfParts(numberOfParts);
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

	public int getUser() {
		return userId;
	}

	public void setUser(int userId) {
		this.userId = userId;
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

	public CommonsMultipartFile getImage1() {
		return image1;
	}

	public void setImage1(CommonsMultipartFile image1) {
		this.image1 = image1;
	}

	public CommonsMultipartFile getImage2() {
		return image2;
	}

	public void setImage2(CommonsMultipartFile image2) {
		this.image2 = image2;
	}

	public CommonsMultipartFile getImage3() {
		return image3;
	}

	public void setImage3(CommonsMultipartFile image3) {
		this.image3 = image3;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
