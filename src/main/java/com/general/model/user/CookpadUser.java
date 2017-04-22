package com.general.model.user;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(property = "userId", generator = ObjectIdGenerators.PropertyGenerator.class)
@Entity
@Table(name="cookpad_user")
public class CookpadUser{

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column
	private String name;

	@JsonIdentityReference(alwaysAsId=true)
	@JoinTable(name = "user_friend",
			joinColumns = {@JoinColumn(name="user_id", referencedColumnName = "id", nullable = false)},
			inverseJoinColumns = {@JoinColumn(name="friend_id", referencedColumnName = "id", nullable = false)}
	)
	@ManyToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	private Set<CookpadUser> friends = new HashSet<CookpadUser>();


	public CookpadUser () {};
	public CookpadUser(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Set<CookpadUser> getFriends() {
		return friends;
	}
	
	public void setFriends(Set<CookpadUser> friends) {
		this.friends = friends;
	}


}
