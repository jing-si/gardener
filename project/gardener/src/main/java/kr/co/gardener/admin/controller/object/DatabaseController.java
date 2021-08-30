package kr.co.gardener.admin.controller.object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.service.object.DatabaseService;

@Controller
@RequestMapping("/admin/object/database/")
public class DatabaseController {
	final String path = "admin/object/database/";
	
	@Autowired
	DatabaseService service;
	
	@RequestMapping({"/","/list"})
	public String list(Model model) {
		String list =  service.list();
		model.addAttribute("list", list);
		return path + "database";
	}
	
}
