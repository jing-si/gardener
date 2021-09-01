package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {
	final String path = "main/";
	
	//즐겨찾기
	@RequestMapping({"","/"})
	public String favorite(Model model) {
		//밑에 두개 리스트 구현해주십쇼
		//즐겨찾기로 등록된 제품의 이미지 리스트
		model.addAttribute("favoriteImgList","favoriteImgList");
		//즐겨찾기로 등록된 제품의 이름 리스트
		model.addAttribute("favoriteNameList","favoriteNameList");
		return path + "favorite";
	}
}
