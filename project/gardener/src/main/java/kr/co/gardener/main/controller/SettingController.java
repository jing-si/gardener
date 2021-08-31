package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
public class SettingController {
	final String path = "main/setting/";
	
	@RequestMapping({"","/"})
	public String setting() {
		return path + "setting";
	}
	
	@RequestMapping("/myinfo")
	public String myinfo() {
		return path + "myinfo";
	}
	
	@RequestMapping("/notice")
	public String notice(Model model) {
		model.addAttribute("noticeTitle","noticeTitle");
		model.addAttribute("noticeDate","noticeDate");
		return path + "notice";
	}
	
	@RequestMapping("/ecostory")
	public String ecostory() {
		return path + "ecostory";
	}
	
	@RequestMapping("/myinfo/update")
	public String update(Model model){
		model.addAttribute("userEmail","userEmail");
		model.addAttribute("userNick","userNick");
		model.addAttribute("userBirth","userBirth");
		model.addAttribute("userGender","userGender");
		return path + "myinfoupdate";
	}
}
