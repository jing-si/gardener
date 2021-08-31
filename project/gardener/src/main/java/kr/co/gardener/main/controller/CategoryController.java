package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	final String path = "main/category/";
	
	
	@RequestMapping({"/",""})
	public String category() {
		return path + "category-list";
	}
	
	@RequestMapping("/product")
	public String productlist() {
		return path + "product-list";
	}
	
	@RequestMapping("/product/detail")
	public String productdetail() {
		return path + "product-detail";
	}
}
