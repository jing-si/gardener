package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
public class SettingController {
	final String path = "setting/";
	
	@RequestMapping({"","/"})
	public String setting() {
		return "setting";
	}
}
