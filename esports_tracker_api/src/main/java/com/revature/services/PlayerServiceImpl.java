package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Player;
import com.revature.repos.IPlayerRepo;


@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	private IPlayerRepo playerRepo;

	@Override
	public List<Player> findAll() {
		return playerRepo.findAll();
	}
}