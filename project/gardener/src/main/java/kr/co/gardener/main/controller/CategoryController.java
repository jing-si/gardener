package kr.co.gardener.main.controller;

import java.util.ArrayList;

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
	public String category(Model model) {
		//productCategoryName(품목별 카테고리 대분류명),
		//subProductCategoryList(productId(품목아이디)와 subProductCategoryName(중분류 카테고리명)이 들어있는 리스트)
		//이 들어있는 품목 대분류 리스트 구현해주세요.(리스트 안에 리스트가 들어있는거 맞습니다^^)
		model.addAttribute("productCategoryList","productcategoryList");
		
		//brandName(브랜드명)이 들어있는 리스트 구현해주세요.
		model.addAttribute("brnadList","brandList");
		return path + "category-list";
	}
	
	//품목별 카테고리
	@RequestMapping("/product")
	public String productlist(Model model) {
		//productId(품목별 제품아이디), productImg(품목별 제품이미지), 
		//productName(품목별 제품명)이 들어있는 리스트 구현해주세요.
		model.addAttribute("productList",new ArrayList<String>());
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
		//브랜드 이름
		model.addAttribute("brandName","brandName");
		//productId(브랜드별 제품 아이디), productImg(브랜드별 제품이미지)
		//productName(브랜드별 제품명)이 들어있는 리스트 구현해주세요.
		model.addAttribute("brandProductList",new ArrayList<String>());
		return path + "brand-list";
	}
	
	//인증마크별 카테고리
	@RequestMapping("/mark")
	public String markList(Model model) {
		//리스트 두개 만들어주세요
		//인증마크 이미지 리스트
		model.addAttribute("markImgList","markImgList");
		//인증마크 이름 리스트
		model.addAttribute("markNameList","markNameList");
		return path + "mark-list";
	}
}
