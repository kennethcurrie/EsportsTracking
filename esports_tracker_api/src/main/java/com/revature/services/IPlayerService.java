package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.Player;

public interface IPlayerService {
	List<Player> findAll();
}
