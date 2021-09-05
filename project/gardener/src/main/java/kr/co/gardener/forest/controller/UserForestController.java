package kr.co.gardener.forest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userforest")
public class UserForestController {
	final String path = "userforest/";
	
	@GetMapping({"","/"})
	public String forest() {
		return path + "forest";
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