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
@RequestMapping("/login/userforest")
public class UserForestController {
	final String path = "userforest/";
	
	@GetMapping({"","/"})
	public String forest() {
		
		
		return path + "forest";
	}
	
	@RequestMapping("userforest/init")
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

		list.add(l1);
		
		Location l2 = new Location();
		l2.setLocationId(1);
		l2.setLocationOrder(2);
		l2.setLocationSize(50);
		l2.setLocationX(400);
		l2.setLocationY(500);
		l2.setPlantId(1);
		l2.setPlantImage("/resources/images/tree_02.png");
		list.add(l2);
		
		Location l3 = new Location();
		l3.setLocationId(1);
		l3.setLocationOrder(1);
		l3.setLocationSize(150);
		l3.setLocationX(600);
		l3.setLocationY(500);
		l3.setPlantId(1);
		l3.setPlantImage("/resources/images/tree_03.png");
		list.add(l3);
		
		return list;
	}
	
	@RequestMapping("/setforest")
	public String setforest() {
		return path + "/setforest";
	}
	
	@RequestMapping("userforest/setforest/init2")
	@ResponseBody
	public List<Location> init2() {
		List<Location> list = new ArrayList<Location>();
		Location l1 = new Location();
		l1.setLocationId(1);
		l1.setLocationOrder(1);
		l1.setLocationSize(1);
		l1.setLocationX(40);
		l1.setLocationY(300);
		l1.setPlantId(1);
		l1.setPlantImage("/resources/images/tree_01.png");
		list.add(l1);
		
		Location l2 = new Location();
		l2.setLocationId(2);
		l2.setLocationOrder(2);
		l2.setLocationSize(0.6f);
		l2.setLocationX(140);
		l2.setLocationY(300);
		l2.setPlantId(2);
		l2.setPlantImage("/resources/images/tree_02.png");
		list.add(l2);
		
		Location l3 = new Location();
		l3.setLocationId(3);
		l3.setLocationOrder(1);
		l3.setLocationSize(0.8f);
		l3.setLocationX(100);
		l3.setLocationY(300);
		l3.setPlantId(3);
		l3.setPlantImage("/resources/images/tree_03.png");
		list.add(l3);
		
		return list;
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