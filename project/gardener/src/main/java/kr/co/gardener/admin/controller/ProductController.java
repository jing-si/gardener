package kr.co.gardener.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/product")
public class ProductController {
	final String path = "admin/product/";
	@RequestMapping({"/"})
	public String index() {
		
		return path + "index";
		
	}
}
