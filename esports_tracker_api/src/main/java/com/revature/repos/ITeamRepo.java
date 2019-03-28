package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Team;

public interface ITeamRepo extends JpaRepository<Team, Integer> {

}
