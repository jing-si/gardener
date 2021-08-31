package kr.co.gardener.admin.controller.object;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.service.object.DataManagerService;

@Controller
@RequestMapping("/admin/object/datamanager/")
public class DataManagerController {
	final String path = "admin/object/datamanager/";

	@Autowired
	DataManagerService service;
	
	@RequestMapping("/")
	public String list() {
		
		return path + "datamanager";
	}
	
	@RequestMapping({ "/list/{start}/{end}" })
	public String list(@PathVariable int start, @PathVariable int end,Model model) {
		List<Company> list = service.list(start,end);		
		model.addAttribute("list", list);
		return path + "datamanager";
	}

}
