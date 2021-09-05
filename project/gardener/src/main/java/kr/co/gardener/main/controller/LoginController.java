package kr.co.gardener.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.User;
import kr.co.gardener.main.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	final String path = "main/login/";
	
	@Autowired
	LoginService loginService;
	
	//로그인
	@GetMapping({"","/"})
	public String login() {
		return path + "login";
	}
	
	@PostMapping({"","/"})
	public String login(User item, HttpSession session) {
		User user = loginService.item(item.getUserId());
		
		if(user != null) {
			String userId = user.getUserId();
			String userPass = user.getUserPass();
			
			if(userId.equals(item.getUserId()) && userPass.equals(item.getUserPass())) {
				session.setAttribute("user", user);
				return  path + "../home";
			}
			
			return path + "login";
		}
	
		return path + "login";
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
