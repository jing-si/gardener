package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	final String path = "main/login/";
	
	//�α���
	@RequestMapping({"","/"})
	public String login() {
		return path + "login";
	}
	
	//ȸ������
	@RequestMapping("/membership")
	public String membership() {
		return path + "membership";
	}
}
