package com.revature.models;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table(name="site_user")
@Entity
public class SiteUser {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="site_user_id")
  private int siteUserId;
  
  @NotNull
  @Column
  private String username;
  
  @NotNull
  @Column(name="password_hash")
  private String passwordHash;
  
  @NotNull
  @Column
  private String salt;

public SiteUser() {
	super();
}

public SiteUser(int siteUserId, @NotNull String username, @NotNull String passwordHash, @NotNull String salt) {
	super();
	this.siteUserId = siteUserId;
	this.username = username;
	this.passwordHash = passwordHash;
	this.salt = salt;
}

public int getSiteUserId() {
	return siteUserId;
}

public void setSiteUserId(int siteUserId) {
	this.siteUserId = siteUserId;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPasswordHash() {
	return passwordHash;
}

public void setPasswordHash(String passwordHash) {
	this.passwordHash = passwordHash;
}

public String getSalt() {
	return salt;
}

public void setSalt(String salt) {
	this.salt = salt;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((passwordHash == null) ? 0 : passwordHash.hashCode());
	result = prime * result + ((salt == null) ? 0 : salt.hashCode());
	result = prime * result + siteUserId;
	result = prime * result + ((username == null) ? 0 : username.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SiteUser other = (SiteUser) obj;
	if (passwordHash == null) {
		if (other.passwordHash != null)
			return false;
	} else if (!passwordHash.equals(other.passwordHash))
		return false;
	if (salt == null) {
		if (other.salt != null)
			return false;
	} else if (!salt.equals(other.salt))
		return false;
	if (siteUserId != other.siteUserId)
		return false;
	if (username == null) {
		if (other.username != null)
			return false;
	} else if (!username.equals(other.username))
		return false;
	return true;
}

@Override
public String toString() {
	return "SiteUser [siteUserId=" + siteUserId + ", username=" + username + ", passwordHash=" + passwordHash
			+ ", salt=" + salt + "]";
}
  
  
  
}
