package kr.co.gardener.forest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.Inven;
import kr.co.gardener.admin.model.Location;
import kr.co.gardener.admin.model.User;
import kr.co.gardener.admin.model.object.Product;

@Controller
@RequestMapping("/login/userforest")
public class UserForestController {
	final String path = "userforest/";
	
	@GetMapping({"","/"})
	public String forest(Model model) {
		List<Inven> list = new ArrayList<Inven>();
		Inven l1 = new Inven();
		l1.setInvenId(1);
		l1.setPlantId(1);
		l1.setInvenAmount(1);
		list.add(l1);
		
		Inven l2 = new Inven();
		l2.setInvenId(2);
		l2.setPlantId(2);
		l2.setInvenAmount(0);
		list.add(l2);
		
		Inven l3 = new Inven();
		l3.setInvenId(3);
		l3.setPlantId(3);
		l3.setInvenAmount(0);
		list.add(l3);
		
		Inven l4 = new Inven();
		l4.setInvenId(4);
		l4.setPlantId(4);
		l4.setInvenAmount(0);
		list.add(l4);
		
		Inven l5 = new Inven();
		l5.setInvenId(5);
		l5.setPlantId(5);
		l5.setInvenAmount(0);
		list.add(l5);
		
		Inven l6 = new Inven();
		l6.setInvenId(6);
		l6.setPlantId(6);
		l6.setInvenAmount(0);
		list.add(l6);
		
		Inven l7 = new Inven();
		l7.setInvenId(7);
		l7.setPlantId(7);
		l7.setInvenAmount(0);
		list.add(l7);
		
		Inven l8 = new Inven();
		l8.setInvenId(8);
		l8.setPlantId(8);
		l8.setInvenAmount(0);
		list.add(l8);
		
		Inven l9 = new Inven();
		l9.setInvenId(9);
		l9.setPlantId(9);
		l9.setInvenAmount(0);
		list.add(l9);
		
		Inven l10 = new Inven();
		l10.setInvenId(10);
		l10.setPlantId(10);
		l10.setInvenAmount(0);
		list.add(l10);
		
		model.addAttribute("list",list);
		
		return path + "forest";
	}
	
	@RequestMapping("/setforest")
	public String setforest() {
		return path + "/setforest";
	}
	
	/*
	 * // 유저가 저장한 숲 데이터 가져오기
	 * 
	 * @RequestMapping({"/userforest/init", "/userforest/setforest/init"})
	 * 
	 * @ResponseBody public List<Location> locationList() { User user =
	 * (User)session.getAttribute("user"); List<Location> list =
	 * service.locationList();
	 * 
	 * return list; }
	 * 
	 * // 유저가 숲 꾸미기를 완료하고 저장한 데이터를 DB에 업로드
	 * 
	 * @RequestMapping("/save")
	 * 
	 * @ResponseBody public String save(Location item, HttpSession session) {
	 * Location location = (Location)session.getAttribute("location");
	 * location.save(item); service.update(location); return "저장완료"; }
	 * 
	 * // 유저 인벤 데이터 가져오기
	 * 
	 * @RequestMapping({"/userforest/inven"})
	 * @ResponseBody public List<Inven> invenList() {
	 *  List<Inven> list = service.invenList();
	 * 
	 * return list; }
	 */

	@RequestMapping("../userforest/init")
	@ResponseBody
	public List<Location> init() {
		List<Location> list = new ArrayList<Location>();
		Location l1 = new Location();
		l1.setLocationId(1);
		l1.setLocationOrder(100);
		l1.setLocationSize(150);
		l1.setLocationX(300);
		l1.setLocationY(500);
		l1.setPlantId(1);
		l1.setPlantImage("/resources/images/tree1.png");

		list.add(l1);
		
		Location l2 = new Location();
		l2.setLocationId(1);
		l2.setLocationOrder(101);
		l2.setLocationSize(50);
		l2.setLocationX(100);
		l2.setLocationY(500);
		l2.setPlantId(1);
		l2.setPlantImage("/resources/images/tree2.png");

		list.add(l2);
		
		Location l3 = new Location();
		l3.setLocationId(1);
		l3.setLocationOrder(102);
		l3.setLocationSize(150);
		l3.setLocationX(20);
		l3.setLocationY(300);
		l3.setPlantId(1);
		l3.setPlantImage("/resources/images/tree3.png");

		list.add(l3);
		
		return list;
	}
	
	/*@RequestMapping({"/", ""})
	public String inven(Model model) {
		
		List<Inven> list = new ArrayList<Inven>();
		Inven l1 = new Inven();
		l1.setInvenId(1);
		l1.setPlantId(1);
		l1.setInvenAmount(1);
		list.add(l1);
		
		Inven l2 = new Inven();
		l2.setInvenId(2);
		l2.setPlantId(2);
		l2.setInvenAmount(0);
		list.add(l2);
		
		Inven l3 = new Inven();
		l3.setInvenId(3);
		l3.setPlantId(3);
		l3.setInvenAmount(0);
		list.add(l3);
		
		Inven l4 = new Inven();
		l4.setInvenId(4);
		l4.setPlantId(4);
		l4.setInvenAmount(0);
		list.add(l4);
		
		Inven l5 = new Inven();
		l5.setInvenId(5);
		l5.setPlantId(5);
		l5.setInvenAmount(0);
		list.add(l5);
		
		Inven l6 = new Inven();
		l6.setInvenId(6);
		l6.setPlantId(6);
		l6.setInvenAmount(0);
		list.add(l6);
		
		model.addAttribute("list",list);
		
		return path + "forest";
	}*/
	
	
	
	
	@RequestMapping("userforest/setforest/init2")
	@ResponseBody
	public List<Location> init2() {
		List<Location> list = new ArrayList<Location>();
		Location l1 = new Location();
		l1.setLocationId(1);
		l1.setLocationOrder(10);
		l1.setLocationSize(1.5f);
		l1.setLocationX(40);
		l1.setLocationY(300);
		l1.setPlantId(1);
		l1.setPlantImage("/resources/images/tree1.png");
		list.add(l1);
		
		Location l2 = new Location();
		l2.setLocationId(2);
		l2.setLocationOrder(11);
		l2.setLocationSize(0.7f);
		l2.setLocationX(140);
		l2.setLocationY(300);
		l2.setPlantId(2);
		l2.setPlantImage("/resources/images/tree2.png");
		list.add(l2);
		
		Location l3 = new Location();
		l3.setLocationId(3);
		l3.setLocationOrder(12);
		l3.setLocationSize(1);
		l3.setLocationX(100);
		l3.setLocationY(300);
		l3.setPlantId(3);
		l3.setPlantImage("/resources/images/tree3.png");
		list.add(l3);
		
		return list;
	}
	
	
	
	
	
}
