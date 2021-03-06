package ifi.p20.gl.entity;
// Generated Sep 11, 2016 4:01:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Message generated by hbm2java
 */
@Entity
@Table(name = "message", catalog = "carnet_location", uniqueConstraints = { @UniqueConstraint(columnNames = "id_user2"),
		@UniqueConstraint(columnNames = "id_user1") })
public class Message implements java.io.Serializable {

	private Integer id;
	private User userByIdUser2;
	private User userByIdUser1;
	private Offer offer;
	private String content;
	private Date date;

	public Message() {
	}

	public Message(User userByIdUser2, User userByIdUser1, Offer offer, String content, Date date) {
		this.userByIdUser2 = userByIdUser2;
		this.userByIdUser1 = userByIdUser1;
		this.offer = offer;
		this.content = content;
		this.date = date;
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
	@JoinColumn(name = "id_user2", unique = true, nullable = false)
	public User getUserByIdUser2() {
		return this.userByIdUser2;
	}

	public void setUserByIdUser2(User userByIdUser2) {
		this.userByIdUser2 = userByIdUser2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_user1", unique = true, nullable = false)
	public User getUserByIdUser1() {
		return this.userByIdUser1;
	}

	public void setUserByIdUser1(User userByIdUser1) {
		this.userByIdUser1 = userByIdUser1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_annonce", nullable = false)
	public Offer getOffer() {
		return this.offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	@Column(name = "content", nullable = false, length = 250)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date", nullable = false, length = 19)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
