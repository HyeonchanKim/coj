package com.coj.webProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coj.webProject.data.CojUser;
import com.coj.webProject.repository.CojUserRepository;

@Service
public class CojUserService {
	@Autowired
	CojUserRepository cojUserRepository;

	public List<CojUser> findAll() {
		List<CojUser> cojUserList = cojUserRepository.findAll();
		return cojUserList;
	}
	
	public void save(CojUser cojuser) {
		cojUserRepository.save(cojuser);
		return;
	}
}
