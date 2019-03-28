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
import com.revature.models.Player;
import com.revature.services.PlayerService;
import com.revature.services.PlayerServiceImpl;

@RestController
@RequestMapping(path="player")
public class PlayerController {
	
	@Autowired
	PlayerService playerService;

	@GetMapping("")
	public ResponseEntity<Player[]> findAll( ) {
		List<Player> result = playerService.findAll();
		Player[] arr = new Player[result.size()];
		arr = result.toArray(arr);
		return new ResponseEntity<Player[]>(arr, HttpStatus.OK);
	}
	
}