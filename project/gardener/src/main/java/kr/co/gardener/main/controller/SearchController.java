package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchController {
	final String path = "search/";
	
	
	@RequestMapping({"/",""})
	public String serch() {
		return "search";
	}
}
