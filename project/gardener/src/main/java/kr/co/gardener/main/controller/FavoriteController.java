package kr.co.gardener.main.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login/favorite")
public class FavoriteController {
	final String path = "main/";
	
	//즐겨찾기
	@RequestMapping({"","/"})
	public String favorite(Model model) {
		//productId(즐겨찾기 선택된 제품의 아이디), favoriteImg(즐겨찾기 선택된 제품의 이미지), favoriteName(즐겨찾기 선택된 제품의 이름)
		//가 들어있있는 리스트 구현해주세요
		model.addAttribute("favoriteList",new ArrayList<String>());
		return path + "favorite";
	}
}
