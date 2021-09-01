package kr.co.gardener.game.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/forest"})
public class UserforestController {
	final String path = "forest/";
	
	@RequestMapping({"", "/", "/list"})
	public String list(Model model) {
		List<Userforest> list = service.list();
		
		model.addAttribute("list", list);
		
		return path + "list";
	}
}
