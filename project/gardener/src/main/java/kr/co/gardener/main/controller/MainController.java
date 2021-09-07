package kr.co.gardener.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.PlantLevel;

@Controller
@RequestMapping("/login")
public class MainController {	
	final String path = "main/";
	
	//메인페이지
	@RequestMapping({"/",""})
	public String index(Model model) {
		model.addAttribute("userNick","userNick");
		return path + "home2";
	}
	
	@RequestMapping("/init")
	@ResponseBody
	public List<PlantLevel> init(){
		List<PlantLevel> list = new ArrayList<PlantLevel>();
		PlantLevel l1 = new PlantLevel();
		l1.setPlantLevelId(5);
		l1.setPlantImage("/resources/images/tree_01.png");
		l1.setPlantId(1);
		list.add(l1);
		
		return list;
	}
}
