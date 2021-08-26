package kr.co.gardener.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/object")
public class ProductController {
	final String path = "admin/object/";
	
	@RequestMapping({"/"})
	public String index() {
		
		return path + "object";		
	}
	
	@RequestMapping({"/classify"})
	public String classify() {
		
		return path + "classify/list";		
	}
}
