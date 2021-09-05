package kr.co.gardener.forest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.Location;

@Controller
@RequestMapping("/userforest")
public class UserForestController {
	final String path = "userforest/";
	
	@GetMapping({"","/"})
	public String forest() {
		
		
		return path + "forest";
	}
	
	@RequestMapping("/init")
	@ResponseBody
	public List<Location> init() {
		List<Location> list = new ArrayList<Location>();
		Location l1 = new Location();
		l1.setLocationId(1);
		l1.setLocationOrder(1);
		l1.setLocationSize(150);
		l1.setLocationX(200);
		l1.setLocationY(500);
		l1.setPlantId(1);
		l1.setPlantImage("/resources/images/tree_01.png");
		l1.setPlantHeight(150);
		l1.setPlantWidth(100);
		list.add(l1);
		
		Location l2 = new Location();
		l2.setLocationId(1);
		l2.setLocationOrder(2);
		l2.setLocationSize(50);
		l2.setLocationX(400);
		l2.setLocationY(500);
		l2.setPlantId(1);
		l2.setPlantImage("/resources/images/tree_02.png");
		l2.setPlantHeight(150);
		l2.setPlantWidth(100);
		list.add(l2);
		
		Location l3 = new Location();
		l3.setLocationId(1);
		l3.setLocationOrder(1);
		l3.setLocationSize(150);
		l3.setLocationX(600);
		l3.setLocationY(500);
		l3.setPlantId(1);
		l3.setPlantImage("/resources/images/tree_03.png");
		l3.setPlantHeight(150);
		l3.setPlantWidth(100);
		list.add(l3);
		
		return list;
	}
	
	@RequestMapping("/setforest")
	public String setforest() {
		return path + "/setforest";
	}
	
	
	/*
	 * @RequestMapping("/setforest") public String setforest(Model model) {
	 * 
	 * }
	 */
	
	
	
}


//유저가 숲을 꾸미고 저장해놓은 데이터 리스트
	//LOCATION 테이블 데이터 필요?
	//@RequestMapping({"", "/", "/list"})s
	//public String list(Model model) {
		//List<Userforest> list = service.list();      
		//model.addAttribute("list", list);
		//return path + "list";
	//}