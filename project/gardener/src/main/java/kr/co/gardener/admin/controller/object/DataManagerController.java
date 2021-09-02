package kr.co.gardener.admin.controller.object;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.model.object.Product;
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
	@ResponseBody
	public List<Company> list(@PathVariable int start, @PathVariable int end) {
		List<Company> list = service.list(start,end);		
		
		return list;
	}
	
	@RequestMapping("/productlist/{companyId}")
	@ResponseBody
	public List<Product> productList(@PathVariable int companyId){
		System.out.println(companyId);
			List<Product> list = service.productList(companyId);
		return list;
	}

}
