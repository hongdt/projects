package ifi.p20.gl.entity;
// Generated Sep 11, 2016 4:01:02 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", catalog = "carnet_location")
public class City implements java.io.Serializable {

	private Integer id;
	private State state;
	private String name;
	private Set<Offer> offers = new HashSet<Offer>(0);
	private Set<Request> requests = new HashSet<Request>(0);
	private Set<Profile> profiles = new HashSet<Profile>(0);

	public City() {
	}

	public City(State state, String name) {
		this.state = state;
		this.name = name;
	}

	public City(State state, String name, Set<Offer> offers, Set<Request> requests, Set<Profile> profiles) {
		this.state = state;
		this.name = name;
		this.offers = offers;
		this.requests = requests;
		this.profiles = profiles;
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
	@JoinColumn(name = "state_id", nullable = false)
	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	@Column(name = "name", nullable = false, length = 30)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Offer> getOffers() {
		return this.offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Request> getRequests() {
		return this.requests;
	}

	public void setRequests(Set<Request> requests) {
		this.requests = requests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Profile> getProfiles() {
		return this.profiles;
	}

	public void setProfiles(Set<Profile> profiles) {
		this.profiles = profiles;
	}

}
