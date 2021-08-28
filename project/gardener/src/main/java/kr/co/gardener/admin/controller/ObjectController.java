package kr.co.gardener.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.Classify;
import kr.co.gardener.admin.service.ClassifyService;

@Controller
@RequestMapping("/admin/object")
public class ObjectController {
	final String path = "admin/object/";
	
	@Autowired
	private ClassifyService classifyService;
	
	
	@RequestMapping({"/"})
	public String index() {
		
		return path + "object";		
	}
	
	@RequestMapping({"/classify"})
	public String classify(Model model) {
		List<Classify> topClass = classifyService.getTopClassList();
		List<Classify> midClass = classifyService.getMidClassList();
		List<Classify> botClass = classifyService.getBotClassList();
		
		model.addAttribute("topClass", topClass);
		model.addAttribute("midClass", midClass);
		model.addAttribute("botClass", botClass);
		
		return path + "classify/list";		
	}
	
}
