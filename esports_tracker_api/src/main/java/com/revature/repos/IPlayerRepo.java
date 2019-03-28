package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Player;

public interface IPlayerRepo extends JpaRepository<Player, Integer> {

}