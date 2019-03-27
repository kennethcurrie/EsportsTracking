package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.MatchHistory;
import com.revature.repos.IMatchHistoryRepo;


@Service
public class MatchHistoryService implements IMatchHistoryService {

	@Autowired
	private IMatchHistoryRepo matchHistoryRepo;

	@Override
	public List<MatchHistory> findAll() {
		return matchHistoryRepo.findAll();
	}
}
