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
import com.revature.models.MatchHistory;
import com.revature.services.MatchHistoryService;
import com.revature.services.MatchHistoryServiceImpl;

@RestController
@RequestMapping(path="matchhistory")
public class MatchHistoryController {
	
	@Autowired
	MatchHistoryService matchHistoryService;

	@GetMapping("")
	public ResponseEntity<MatchHistory[]> findAll( ) {
		List<MatchHistory> result = matchHistoryService.findAll();
		MatchHistory[] arr = new MatchHistory[result.size()];
		arr = result.toArray(arr);
		return new ResponseEntity<MatchHistory[]>(arr, HttpStatus.OK);
	}
	
}