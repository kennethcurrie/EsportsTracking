package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.SiteUser;
import com.revature.repos.ISiteUserRepo;

@Service
public class SiteUserServiceImpl implements SiteUserService {

	@Autowired
	private ISiteUserRepo siteUserRepo;

	@Override
	public List<SiteUser> findAll() {
		return siteUserRepo.findAll();
	}
}