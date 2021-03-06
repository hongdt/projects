package ifi.p20.gl.entity;
// Generated Sep 11, 2016 4:01:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Offer generated by hbm2java
 */
@Entity
@Table(name = "offer", catalog = "carnet_location")
public class Offer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private User user;
	private String name;
	private float price;
	private int number_of_parts;
	private float area;
	private String country;
	private String city;
	private String street;
	private String description;
	private Date date;
	private byte[] image1;
	private byte[] image2;
	private byte[] image3;
	private int status;
	private Set<Comment> comments = new HashSet<Comment>(0);
	private Set<Message> messages = new HashSet<Message>(0);
	private Set<OfferFavorite> offerFavorites = new HashSet<OfferFavorite>(0);

	public Offer() {
	}

	public Offer(User user, String name, float price, float area, int number_of_parts, String country, String city, String street, Date date,
			byte[] image1, byte[] image2, byte[] image3, int status) {
		this.user = user;
		this.name = name;
		this.price = price;
		this.area = area;
		this.number_of_parts = number_of_parts;
		this.country = country;
		this.city = city;
		this.street = street;
		this.date = date;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.status = status;
	}

	public Offer(User user, String name, float price, float area, int number_of_parts, String country, String city, String street,
			String description, Date date, byte[] image1, byte[] image2, byte[] image3, int status,
			Set<Comment> comments, Set<Message> messages, Set<OfferFavorite> offerFavorites) {
		this.user = user;
		this.name = name;
		this.price = price;
		this.area = area;
		this.number_of_parts = number_of_parts;
		this.country = country;
		this.city = city;
		this.street = street;
		this.description = description;
		this.date = date;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.status = status;
		this.comments = comments;
		this.messages = messages;
		this.offerFavorites = offerFavorites;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", nullable = false, precision = 12, scale = 0)
	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Column(name = "area", nullable = false, precision = 12, scale = 0)
	public float getArea() {
		return this.area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Column(name = "country", nullable = false, length = 250)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "city", nullable = true, length = 250)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "street", nullable = false, length = 250)
	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "description", length = 250)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Lob
	@Column(name = "image1", nullable = false, columnDefinition = "longblob")
	public byte[] getImage1() {
		return this.image1;
	}

	public void setImage1(byte[] image1) {
		this.image1 = image1;
	}

	@Lob
	@Column(name = "image2", nullable = false, columnDefinition = "longblob")
	public byte[] getImage2() {
		return this.image2;
	}

	public void setImage2(byte[] image2) {
		this.image2 = image2;
	}

	@Lob
	@Column(name = "image3", nullable = false, columnDefinition = "longblob")
	public byte[] getImage3() {
		return this.image3;
	}

	public void setImage3(byte[] image3) {
		this.image3 = image3;
	}

	@Column(name = "status", nullable = false)
	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offer")
	public Set<Comment> getComments() {
		return this.comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offer")
	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "offer")
	public Set<OfferFavorite> getOfferFavorites() {
		return this.offerFavorites;
	}

	public void setOfferFavorites(Set<OfferFavorite> offerFavorites) {
		this.offerFavorites = offerFavorites;
	}
	
	@Column(name = "number_of_parts", nullable = false)
	public int getNumber_of_parts() {
		return number_of_parts;
	}

	public void setNumber_of_parts(int number_of_parts) {
		this.number_of_parts = number_of_parts;
	}

}
