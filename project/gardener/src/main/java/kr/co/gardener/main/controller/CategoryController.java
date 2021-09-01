package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
	final String path = "main/category/";
	
	//카테고리
	@RequestMapping({"/",""})
	public String category() {
		return path + "category-list";
	}
	
	//품목별 카테고리
	@RequestMapping("/product")
	public String productlist() {
		return path + "product-list";
	}
	
	//해당 제품의 상세페이지
	@RequestMapping("/product/{productId}")
	public String productdetail(@PathVariable int productId) {
		return path + "product-detail";
	}
	
	//브랜드별 카테고리
	@RequestMapping("/brand")
	public String brandList(Model model) {
		model.addAttribute("brandName","brandName");
		//밑에 두개 리스트 만들어주세요
		//해당 브랜드 제품의 이름 리스트
		model.addAttribute("productNameList","productNameList");
		//해당 브랜드의 제품의 이미지 리스트
		model.addAttribute("productImgList","productImgList");
		return path + "brand-list";
	}
}
