package ifi.p20.gl.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import ifi.p20.gl.entity.User;

public class OfferInfo {
	private int id;
	private String nameAdvertise;
	private String userName;
	private float area;
	private int numberOfParts;
	private float price;
	private String country;
	private String city;
	private String street;
	private CommonsMultipartFile image1;
	private CommonsMultipartFile image2;
	private CommonsMultipartFile image3;
	private String description;
	private int status;

	public OfferInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfferInfo(String nameAdvertise, String userName, float area, int numberOfParts, float price, String country, String city,
			String street, String description, int status) {
		super();
		this.nameAdvertise = nameAdvertise;
		this.userName = userName;
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

}
