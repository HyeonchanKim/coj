package com.coj.webProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.coj.webProject.data.CojUser;
import com.coj.webProject.service.CojUserService;

@RestController
@RequestMapping(path="/")
public class CojUserController {

	@Autowired
	private CojUserService cojUserService;

	@GetMapping("user")
	public List<CojUser> getCojUser() {
		return cojUserService.findAll();
	}
}
