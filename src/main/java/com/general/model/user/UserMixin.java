package com.general.model.user;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(property = "id", generator = ObjectIdGenerators.PropertyGenerator.class)
public interface UserMixin {

	@JsonProperty("id") int getId();
	@JsonProperty("name") String getName();
	
	@JsonIdentityReference(alwaysAsId=true)
	@JsonProperty("friends")
	Set<CookpadUser> getFriends();
}
