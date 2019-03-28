package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Team;
import com.revature.repos.ITeamRepo;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private ITeamRepo teamRepo;

	@Override
	public List<Team> findAll() {
		return teamRepo.findAll();
	}
}