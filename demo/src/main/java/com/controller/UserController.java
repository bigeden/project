package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vo.UserVO;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String user(Model model) {
		String info = "";
		UserVO user = new UserVO();
		user.setUser(1);
		
		info += "나는";
		info += user.getUser();
		info += "번유저입니다.";
		
		model.addAttribute("info",info);
		
		return "user";
		
	}

}
