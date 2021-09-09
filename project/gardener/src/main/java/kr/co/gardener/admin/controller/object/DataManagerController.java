package kr.co.gardener.admin.controller.object;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.model.object.Product;
import kr.co.gardener.admin.service.object.CompanyService;
import kr.co.gardener.admin.service.object.DataManagerService;

@Controller
@RequestMapping("/admin/object/datamanager/")
public class DataManagerController {
	final String path = "admin/object/datamanager/";

	@Autowired
	DataManagerService service;
	
	@Autowired
	CompanyService companyService;
	
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
	public List<Product> productList(@PathVariable long companyId){
		System.out.println(companyId);
			List<Product> list = service.productList(companyId);
			List<Product> elist = service.eProductList(companyId);
			list.addAll(elist);
		return list;
	}
	
	@RequestMapping({ "/productlist/{start}/{end}" })
	@ResponseBody
	public List<Product> productList(@PathVariable int start, @PathVariable int end) {
		List<Product> list = service.productList(start,end);		
		
		return list;
	}
	
	@RequestMapping("/companylist/db")
	@ResponseBody
	public List<Company> companylist(){
		List<Company> list = companyService.list();
		
		return list;
	}
	
	@RequestMapping(value="product/bulkupdate", produces="application/json;charset=UTF-8", method=RequestMethod.POST)
	@ResponseBody
	public List<Product> bulkUpdate(@RequestBody String str) {		
		List<Product> list = new ArrayList<Product>();
//		Product[] p;
		try {
		            JsonParser jsonParser = new JsonParser();
		            JsonElement jo = jsonParser.parse(str);		            
		            JsonArray jsonArr = jo.getAsJsonArray();
		            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
//		            p = gson.fromJson(jo, Product[].class);
//		            jsonArr.forEach(data->{		            	
//		            Product com = gson.fromJson(data, Product.class);
//		            list.add(com);
//		            System.out.println(data.getAsJsonObject().get("productId"));
//		            });
		            
//		            @SuppressWarnings("serial")
//					Type collectionType = new TypeToken<ArrayList<Product>>(){}.getType();
//					ArrayList<Product> enums = gson.fromJson(jo, collectionType);
//					System.out.println(enums.get(0).getProductName());
		} catch (Exception e) {
		e.printStackTrace();
		}
		
		System.out.println("사이즈" + list.size());
		service.bulkUpdate(list);
		
		return list;
	}
}
