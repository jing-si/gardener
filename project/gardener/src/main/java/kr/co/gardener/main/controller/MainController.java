package kr.co.gardener.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.PlantLevel;
import kr.co.gardener.admin.model.User;
import kr.co.gardener.admin.service.UserService;

@Controller
@RequestMapping("/login")
public class MainController {	
	final String path = "main/";
	
	@Autowired
	UserService service;
	
	//메인페이지
	@RequestMapping("/") //db변경이 없을때 용도
	public String index(Model model,HttpSession session) {
		User user = (User) session.getAttribute("user");
		model.addAttribute("img", imgSrc(user));
		/*
		 * model.addAttribute("userNick","userNick"); model.addAttribute("plantId","1");
		 * model.addAttribute("stateId","0");
		 */
		return path + "home2";
	}
	
	@RequestMapping("/home") //session갱신용, db변경했을떄 용도
	public String index(HttpSession session) {
		String userId = ((User) session.getAttribute("user")).getUserId();
		User user = service.item(userId); //유저만듦
		session.setAttribute("user", user);
		return path + "home2"; //오류날수도있음.......ㅎ...remove 필요할지도?
	}
	
	private String imgSrc(User user) {
		return service.imgSrc(user);
		
	}
	
	
	/*
	 * @RequestMapping({"/",""}) public String index(Model model) {
	 * model.addAttribute("userNick","userNick"); model.addAttribute("plantId","1");
	 * model.addAttribute("stateId","0"); return path + "home2"; }
	 */
	
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
