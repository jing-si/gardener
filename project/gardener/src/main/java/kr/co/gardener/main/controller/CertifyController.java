package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/certify")
public class CertifyController {
	final String path = "certify/";
	
	@RequestMapping("certify")
	public String certify() {
		return "certify";
	}
}
