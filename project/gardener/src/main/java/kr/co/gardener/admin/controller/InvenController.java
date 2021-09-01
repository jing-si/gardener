package kr.co.gardener.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.Inven;
import kr.co.gardener.admin.service.InvenService;

@Controller
@RequestMapping("/admin/users/inven")
public class InvenController {
	final String path = "admin/users/inven/";
	
	@Autowired
	InvenService service;
	
	@RequestMapping({"/","list"})
	public String list(Model model) {
		List<Inven> item = service.list();
		model.addAttribute(item);
		return path + "list";
	}
	
	@GetMapping("/add")
	public String add() {
		return path + "add";
	}
	
	@PostMapping("/add")
	public String add(Inven item) {
		service.add(item);
		return "redirect:list";
	}
	
	@GetMapping("/update/{invenId}")
	public String update(@PathVariable int invenId, Model model) {
		Inven item = service.item(invenId);
		model.addAttribute("item", item);
		return path + "update";
	}
	
	@PostMapping("/update/{invenId}")
	public String update(@PathVariable int invenId, Inven item) {
		item.setInvenId(invenId);
		service.update(item);
		return "redirect:../list";
	}
	
	@GetMapping("/delete/{invenId}")
	public String delete(@PathVariable int invenId) {
		service.delete(invenId);
		return "redirect:../list";
	}
	
	
}
