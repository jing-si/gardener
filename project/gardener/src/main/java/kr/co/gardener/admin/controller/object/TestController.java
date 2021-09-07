package kr.co.gardener.admin.controller.object;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.util.SeleniumCrawler;

@Controller
@RequestMapping("admin/object/test/")
public class TestController {
		final private String path = "admin/object/" ;
		String search = "고양이";
		String url = "https://www.google.com/search?q=%EA%B3%A0%EC%96%91%EC%9D%B4&sxsrf=AOaemvKAAWrbnd8VkyyWeZEw6x1ARylipA:1630824648507&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjvq_Wen-fyAhWCZt4KHaT-Bu4Q_AUoAXoECAEQAw&biw=1920&bih=937";
		
		
			
		@RequestMapping("/")		
		public String test(Model model) {
			
			SeleniumCrawler sc = new SeleniumCrawler();
				model.addAttribute("list", sc.activateBot("스파크"));
			
			return path + "test";
		}
}
