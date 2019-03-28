package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Game;
import com.revature.repos.IGameRepo;


@Service
public class GameService implements IGameService {

	@Autowired
	private IGameRepo gameRepo;

	@Override
	public List<Game> findAll() {
		return gameRepo.findAll();
	}
}
