package com.revature.models;
import javax.persistence.Column;

@Table(name="site_user")
@Entity
public class SiteUser {

  @Id (name="site_user_id")
  private int siteUserId;
  
  @Column
  private String username;
  
  @Column(name="password_hash")
  private String passwordHash;
  
  @Column
  private String salt;
  
  
}
