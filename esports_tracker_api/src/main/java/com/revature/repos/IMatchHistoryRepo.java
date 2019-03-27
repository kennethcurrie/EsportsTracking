package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.MatchHistory;

public interface IMatchHistoryRepo extends JpaRepository<MatchHistory, Integer> {

}
