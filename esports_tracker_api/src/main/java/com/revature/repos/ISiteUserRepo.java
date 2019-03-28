package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.SiteUser;

public interface ISiteUserRepo extends JpaRepository<SiteUser, Integer> {

}