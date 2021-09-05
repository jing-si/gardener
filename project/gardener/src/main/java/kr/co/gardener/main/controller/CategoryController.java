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
		model.addAttribute("productCategoryList",new ArrayList<String>());
		
		//brandName(브랜드명),brandId(브랜드 아이디)가 들어있는 리스트 구현해주세요.
		model.addAttribute("brnadList",new ArrayList<String>());
		
		//markId(인증마크 아이디), markImg(인증마크 이미지), markName(인증마크명)이 들어있는 리스트 구형해주세요.
		model.addAttribute("markList",new ArrayList<String>());
		return path + "category-list";
	}
	
	//품목별 카테고리
	@RequestMapping("/product")
	public String productlist(Model model) {
		//품목별 카테고리에서 소분류 제목
		model.addAttribute("productCategoryList",new ArrayList<String>());
		
		//productId(품목별 제품아이디), productImg(품목별 제품이미지), 
		//productName(품목별 제품명)이 들어있는 리스트 구현해주세요.
		model.addAttribute("productList",new ArrayList<String>());
		return path + "product-list";
	}
	
	//해당 제품의 상세페이지
	@RequestMapping("/product/{productId}")
	public String productdetail(@PathVariable int productId, Model model) {
		//uri로 받은 productId에 해당하는
		//제품이미지
		model.addAttribute("productImg","productImg");
		//제품명
		model.addAttribute("productName","productName");
		//제품규격
		model.addAttribute("productSize","productSize");
		//제품 인증기간
		model.addAttribute("productCertifySection","productCertifySection");
		//제품 인증사유
		model.addAttribute("productCertifyReason","productCertifyReason");
		//환경표지 인증번호
		model.addAttribute("markNumber","markNumber");
		//환경표지 인증기간
		model.addAttribute("markSession","markSession");
		//기업명
		model.addAttribute("companyName","companyName");
		//기업 전화번호
		model.addAttribute("companyPhone","companyPhone");
		
		//uri로 받은 productId에 해당하는 productId(동일브랜드 제품의 아이디) sameBrandImg(동일브랜드 제품의 이미지), sameBrandName(동일브랜드 제품명)
		//이 들어있는 리스트 구현해주세요.
		model.addAttribute("sameBrandProductLIst",new ArrayList<String>());
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
		//productId(해당 인증마크에 해당하는 제품 아이디), markProductImg(해당 인증마크에 해당하는 제품의 이미지), 
		//markProductName(인증마크에 해당하는 제품의 이름)이 들어있는 리스트 구현해주세요
		model.addAttribute("markProductList",new ArrayList<String>());
		return path + "mark-list";
	}
}
