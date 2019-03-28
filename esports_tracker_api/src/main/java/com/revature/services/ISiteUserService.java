package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.SiteUser;

public interface ISiteUserService {
	List<SiteUser> findAll();
}
