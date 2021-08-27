package kr.co.gardener.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.Forest;
import kr.co.gardener.admin.service.ForestService;


@Controller
@RequestMapping("/admin/forest")
public class ForestController {
	final String path = "admin/forest/";
	
	@Autowired
	ForestService service;
	
	@RequestMapping({"/", "list"})
	public String list(Model model) {
		List<Forest> list = service.list();
		model.addAttribute("list", list);
		return path+"list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path+"add";
	}
	
	@PatchMapping("/add")
	public String add(Forest item) {
		service.add(item);
		return "redirect:list";
	}
	
	@GetMapping("/update/{forestId}")
	public String update(@PathVariable int forestId, Model model) {
		Forest item = service.item(forestId);
		model.addAttribute("item", item);
		return path+"update";
	}
	
	@PostMapping("/update/{forestId}")
	public String update(@PathVariable int forestId, Forest item) {
		item.setForestId(forestId);
		service.update(item);
		return "redirect:..";
	}
	
	@RequestMapping("/delete/{forestId}")
	public String delete(@PathVariable int forestId) {
		service.delete(forestId);
		return "redirect:..";
	}
	
}
