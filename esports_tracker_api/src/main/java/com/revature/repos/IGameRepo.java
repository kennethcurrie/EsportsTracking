package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Game;

public interface IGameRepo extends JpaRepository<Game, Integer> {

}
