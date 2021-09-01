package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchController {
	final String path = "main/search/";
	
	//검색
	@RequestMapping({"/",""})
	public String search(Model model) {
		//latestProduct(최근검색 제품명) 리스트 구현해주세요
		model.addAttribute("latestProductList","latestProductList");
		return path + "search";
	}
}
