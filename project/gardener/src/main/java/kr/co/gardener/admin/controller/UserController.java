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
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.gardener.admin.model.User;
import kr.co.gardener.admin.service.UserService;

@Controller
@RequestMapping("/admin/users/user")
public class UserController {
	final String path = "admin/users/user/";
	
	@Autowired
	UserService service;
	
	@RequestMapping({"/", "list"})
	public String list(Model model) {
		List<User> list = service.list();
		model.addAttribute("list", list);
		return path+"list";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public String add() {
		return path+"add";
	}
	
	@RequestMapping(value="/add", method= RequestMethod.POST)
	public String add(User item) {
		service.add(item);
		return "redirect:list";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(String userId, Model model) {
		User item = service.item(userId);
		model.addAttribute("item", item);
		return path+"update";
	}
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public String update(User item) {
		service.update(item);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(String userId) {
		service.delete(userId);
		return "redirect:list";
	}
	
}