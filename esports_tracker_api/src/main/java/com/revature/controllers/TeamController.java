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
import com.revature.models.Team;
import com.revature.services.TeamService;
import com.revature.services.TeamServiceImpl;

@RestController
@RequestMapping(path="team")
public class TeamController {
	
	@Autowired
	TeamService teamService;

	@GetMapping("")
	public ResponseEntity<Team[]> findAll( ) {
		List<Team> result = teamService.findAll();
		Team[] arr = new Team[result.size()];
		arr = result.toArray(arr);
		return new ResponseEntity<Team[]>(arr, HttpStatus.OK);
	}
	
}