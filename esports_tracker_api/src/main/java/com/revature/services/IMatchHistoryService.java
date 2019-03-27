package com.revature.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.revature.models.MatchHistory;

public interface IMatchHistoryService {
	List<MatchHistory> findAll();
}
