package kr.co.gardener.main.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.gardener.admin.model.User;
import kr.co.gardener.main.service.SettingService;

@Controller
@RequestMapping("/login/setting")
public class SettingController {
   final String path = "main/setting/";
   
   
   @Autowired
   SettingService service;
   
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
	   //여기서부터 가상 데이터
	   //List<>
	   //여기까지 가상데이터
	   
	   
      //noticeTitle(공지사항제목), noticeDate(공지사항 날짜), noticeContent(공지사항 내용)이 들어있는 리스트 구현해주세요
      model.addAttribute("noticeList",new ArrayList<String>());
      return path + "notice";
   }
   
   //친환경이야기
   @RequestMapping("/ecostory")
   public String ecostory() {
      return path + "ecostory";
   }
   
   //내정보수정
   @GetMapping("/myinfo/update")
   public String update(Model model){
      
      //순서대로 유저이메일, 유저닉네임, 유저생년월일, 유저성별입니다.
      model.addAttribute("userEmail","userEmail");
      model.addAttribute("userNick","userNick");
      model.addAttribute("userBirth","userBirth");
      model.addAttribute("userGender","userGender");
      return path + "myinfoupdate";
   } 
   
   //내정보수정 폼
   @PostMapping("/myinfo/update")
   public String update(User user) {
      //나중에 지우기
      System.out.println(user.toString());
      return "redirect:../myinfo";
   }
   
   //로그아웃
   @RequestMapping("/logout")
   public String logout(HttpSession session) {
		session.invalidate();
	   return "redirect:../login/";
   }
   
   
	/*
	 * 회원탈퇴get 회원탈퇴post
	 */
   
   
   //회원 탈퇴 - get
   @GetMapping("/out")
   public String out() {
	   return "redirect:../login/";
   }
   
   //회원 탈퇴 - post
   @RequestMapping(value="/memberDelete", method = RequestMethod.POST)
	public String out(User item, HttpSession session, RedirectAttributes rttr) throws Exception{
		
		// 세션에 있는 member를 가져와 member변수에 넣어줍니다.
		User user = (User) session.getAttribute("user");
		// 세션에있는 비밀번호
		String sessionPass = user.getUserPass();
		// item으로 들어오는 비밀번호
		String itemPass = item.getUserPass();
		
		if(!(sessionPass.equals(itemPass))) {
			rttr.addFlashAttribute("msg", false);
			return "redirect:../login/";
		}
		service.out(item);
		session.invalidate();
		return "redirect:/";
	}
   
   
	/*
	 * //탈퇴
	 * 
	 * @RequestMapping("/out") public String out() { return "redirect:../login/"; }
	 */
}