package kr.co.gardener.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.Plant;
import kr.co.gardener.admin.model.PlantLevel;

@Controller
@RequestMapping("/login")
public class MainController {	
	final String path = "main/";
	
	//메인페이지
	@RequestMapping({"/",""})
	public String index(Model model) {
		model.addAttribute("userNick","userNick");
		model.addAttribute("plantId","1");
		model.addAttribute("stateId","0");
		return path + "home2";
	}
	
	@RequestMapping("/init")
	@ResponseBody
	public List<PlantLevel> init(Model model){
		
		model.addAttribute("stateId",0);
		
		List<PlantLevel> list = new ArrayList<PlantLevel>();
		PlantLevel l1 = new PlantLevel();
		l1.setPlantId(1);
		l1.setPlantImage("/resources/images/tree_01.png");
		list.add(l1);
		
		PlantLevel l2 = new PlantLevel();
		l2.setPlantId(2);
		l2.setPlantImage("/resources/images/tree_02.png");
		list.add(l2);
		
		PlantLevel l3 = new PlantLevel();
		l3.setPlantId(3);
		l3.setPlantImage("/resources/images/tree_03.png");
		list.add(l3);
		
		return list;
	}
}
