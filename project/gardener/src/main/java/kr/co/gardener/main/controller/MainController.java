package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/",""})
public class MainController {	
	final String path = "main/";
	
	@RequestMapping({"/",""})
	public String index(Model model) {
		model.addAttribute("userNick","userNick");
		return path + "home";
	}
}
	
