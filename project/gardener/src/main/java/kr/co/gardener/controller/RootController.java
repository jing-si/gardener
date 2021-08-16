package kr.co.gardener.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.model.User;

@Controller
public class RootController {
	
	@Autowired
	SqlSession sql;
	
	@RequestMapping("/")
	public String main(Model model) {
		List<User> list = sql.selectList("user.list"); 
		model.addAttribute("list", list);
		return "main";
	}
	
	
}
