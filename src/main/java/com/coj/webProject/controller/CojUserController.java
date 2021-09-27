package com.coj.webProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coj.webProject.data.CojUser;
import com.coj.webProject.service.CojUserService;

@RestController
@RequestMapping(path="/")
public class CojUserController {

	@Autowired
	private CojUserService cojUserService;

	@GetMapping("/user")
	public String getCojUser(Model model) {
		List<CojUser> list = cojUserService.findAll();
		model.addAttribute("list", list);
		return "user";
	}
}
