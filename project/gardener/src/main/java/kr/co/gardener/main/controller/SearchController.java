package kr.co.gardener.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchController {
	final String path = "main/search/";
	
	//�˻�
	@RequestMapping({"/",""})
	public String search(Model model) {
		//�ֱٰ˻� ��ǰ�� ����Ʈ �������ּ���
		model.addAttribute("latestProductNameList","latestProductNameList");
		return path + "search";
	}
}
