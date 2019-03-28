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
import com.revature.models.Game;
import com.revature.services.GameService;
import com.revature.services.GameServiceImpl;

@RestController
@RequestMapping(path="game")
public class GameController {
	
	@Autowired
	GameService gameService;

	@GetMapping("")
	public ResponseEntity<Game[]> findAll( ) {
		List<Game> result = gameService.findAll();
		Game[] arr = new Game[result.size()];
		arr = result.toArray(arr);
		return new ResponseEntity<Game[]>(arr, HttpStatus.OK);
	}
	
}