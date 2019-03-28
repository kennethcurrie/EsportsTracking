package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.Team;

public interface ITeamService {
	List<Team> findAll();
}
