package com.revature.models;

import com.revature.util.MD5;

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
  
  @Override
public String toString() {
	return "SiteUser [siteUserId=" + siteUserId + ", username=" + username + "]";
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

@NotNull
  @Column
  private String salt;

	public SiteUser() {
		super();
	}
	
	public SiteUser(String username, String password) {
		this.siteUserId = 0;
		this.username = username;
		this.salt = MD5.getMD5(username);
		this.passwordHash = MD5.getMD5(password+salt);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.passwordHash = MD5.getMD5(password+salt);
	}
	
	public boolean checkCredentials(String username, String password) {
		return (this.username==username&&this.passwordHash==MD5.getMD5(password+salt));
	}

	public int getSiteUserId() {
		return siteUserId;
	}
}
