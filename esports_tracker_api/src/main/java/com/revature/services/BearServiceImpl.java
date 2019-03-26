package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Bear;
import com.revature.repos.BearRepo;

@Service
public class BearServiceImpl implements BearService {

	private BearRepo bearRepo;

	public Bear save(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bear update(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	public Bear delete(Bear b) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bear> findAll() {
		return bearRepo.findAll();
	}

	public Bear findById(int id) {
		return bearRepo.getOne(id);
	}

	public List<Bear> findByCaveId(int caveId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bear> findByLegs(int legs) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bear> findByColor(String color) {
		return bearRepo.findByColor(color);
	}

	public List<Bear> findByCaveType(String caveType) {
		return bearRepo.findByCaveType(caveType);
	}

	public List<Bear> findByBreed(String breed) {
		return bearRepo.findByBreed(breed);
	}

}
