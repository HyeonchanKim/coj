package com.coj.webProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coj.webProject.data.CojUser;
import com.coj.webProject.service.CojUserService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private CojUserService cojUserService;

	@GetMapping("/")
	public String homeView() {
		return "home";
	}
	
	@GetMapping("/signin")
	public String sign_in(Model model) {
		return "sign_in";
	}
	
	@GetMapping("/signup")
	public String sign_up(Model model) {
		model.addAttribute("cojuser", new CojUser());
		return "sign_up";
	}
	
	@PostMapping("/signup")
	public String sign_up_submit(@ModelAttribute CojUser cojuser) {
		cojUserService.save(cojuser);
		return "redirect:/header";
	}
	
	@GetMapping("/header")
	public String header(Model model) {
		List<CojUser> list = cojUserService.findAll();
		model.addAttribute("list", list);
		return "header";
	}
}
