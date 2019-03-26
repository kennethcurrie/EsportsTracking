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
  
  
}
