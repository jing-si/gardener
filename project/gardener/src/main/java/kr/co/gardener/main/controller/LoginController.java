package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.User;

@Controller
@RequestMapping("/login")
public class LoginController {
	final String path = "main/login/";
	
	//로그인
	@GetMapping({"","/"})
	public String login() {
		return path + "login";
	}
	
	//로그인 폼
	@PostMapping({"","/"})
	public String login(User user, Model model) {
		//userId, userPass
		//나중에 지우기
		System.out.println(user.toString());
		return "redirect:..";
	}
	
	//회원가입
	@GetMapping("/membership")
	public String membership() {
		return path + "membership2";
	}
	
	@PostMapping("/membership")
	public String membership(Model model, User user) {
		//나중에 지우기
		System.out.println(user.toString());
		return "redirect:..";
	}
	
	@RequestMapping("/pwupdate")
	public String pwupdate() {
		return path + "pwupdate";
	}
}
