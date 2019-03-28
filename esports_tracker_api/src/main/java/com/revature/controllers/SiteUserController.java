package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.LogNameData;
import com.revature.models.SiteUser;
import com.revature.services.ISiteUserService;
import com.revature.services.SiteUserService;

@RestController
@RequestMapping(path="siteuser")
public class SiteUserController {
	
	@Autowired
	ISiteUserService SiteUserService;

	@GetMapping("")
	public ResponseEntity<SiteUser[]> findAll( ) {
		List<SiteUser> result = SiteUserService.findAll();
		SiteUser[] arr = new SiteUser[result.size()];
		arr = result.toArray(arr);
		return new ResponseEntity<SiteUser[]>(arr, HttpStatus.OK);
	}
	
}