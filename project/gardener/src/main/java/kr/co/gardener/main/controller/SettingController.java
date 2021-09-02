package kr.co.gardener.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
public class SettingController {
	final String path = "main/setting/";
	
	//설정
	@RequestMapping({"","/"})
	public String setting() {
		return path + "setting";
	}
	
	//내정보보기
	@RequestMapping("/myinfo")
	public String myinfo() {
		return path + "myinfo";
	}
	
	//공지사항
	@RequestMapping("/notice")
	public String notice(Model model) {
		//리스트 세개 구현해주세요
		//공지사항 제목 리스트
		model.addAttribute("noticeTitleList","noticeTitleList");
		//공지사항 날짜 리스트
		model.addAttribute("noticeDateList","noticeDateList");
		//공지사항 내용 리스트
		model.addAttribute("noticeContentList","noticeContentList");
		return path + "notice";
	}
	
	//친환경이야기
	@RequestMapping("/ecostory")
	public String ecostory() {
		return path + "ecostory";
	}
	
	//내정보수정
	@RequestMapping("/myinfo/update")
	public String update(Model model){
		//순서대로 유저이메일, 유저닉네임, 유저생년월일, 유저성별입니다.
		model.addAttribute("userEmail","userEmail");
		model.addAttribute("userNick","userNick");
		model.addAttribute("userBirth","userBirth");
		model.addAttribute("userGender","userGender");
		return path + "myinfoupdate";
	}
}
