package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.Game;

public interface GameService {
	List<Game> findAll();
}