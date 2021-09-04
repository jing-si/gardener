package kr.co.gardener.admin.controller.object;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/object/test/")
public class TestController {
		final private String path = "admin/object/" ;
		String search = "고양이";
		String url = "http://www.ecomoney.co.kr/app/green/InqEcoProduct.ctm?INIpluginData=vf%3d10%26sk%3dfhy7NWXtsX9uWRrsR7BfYFoNsAljTfr8MdGP7KJPng9bfP6cf1jR8IoqhqfIeLmL%250apu3o4KyibdQOVckE2iRQlbRxbFzoNrYXDGorMaoZRc4x1cc1GTWL6vH%252bhnZFIxwb%250aE4rBVeEiu4Sfx4s5G/IibT4N4rPejtohd6xYrGDFg8jJMdjzV4e2OL28avb2lZRL%250ax/oj4woMFyLufzzVT8U%252ba463iqdEeCcV9XFHOuEM6m2IDge1ZkxLSSVtLs0XF2b6%250acbG8MDRe3rPW9SkyaqkZujGIyBse6KprgjckIWO7Iy3yS6NQAZnsbNdrqMsHpU7t%250a2ffnBZKJQ0JDIc8ZKaXDXw%253d%253d%250a%26cc%3d%26sg%3d%26alg%3dc3ltOlNFRUQtQ0JDO2t4OlJTQTE1O2t4aDpTSEExO3NnOlJTQTE1O3NnaDpTSEEx%250a%26dt%3dCjkXJmcTpojA/zwgCuk01Fwrs25Q1xs7VDFd8qC6W3jKDbqFz5xX7U6iVUOJgv4A%250a%26er%3d%26ts%3dXrtPIpwktbInBRdkYu0R7w%253d%253d%250a%26kecc%3d%26iver%3d100";
		@RequestMapping("/")
		public String test(Model model) {
			List<String> list = new ArrayList<>();
			
			try {
				Document doc = Jsoup.connect(url).get();
				
				Elements items = doc.getElementsByTag("img");
				list = items.eachAttr("src");
				
				model.addAttribute("list", list);
				model.addAttribute("url", url);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			return path + "test";
		}
}
