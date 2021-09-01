package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favorite")
public class FavoriteController {
	final String path = "main/";
	
	//���ã��
	@RequestMapping({"","/"})
	public String favorite(Model model) {
		//�ؿ� �ΰ� ����Ʈ �������ֽʼ�
		//���ã��� ��ϵ� ��ǰ�� �̹��� ����Ʈ
		model.addAttribute("favoriteImgList","favoriteImgList");
		//���ã��� ��ϵ� ��ǰ�� �̸� ����Ʈ
		model.addAttribute("favoriteNameList","favoriteNameList");
		return path + "favorite";
	}
}
