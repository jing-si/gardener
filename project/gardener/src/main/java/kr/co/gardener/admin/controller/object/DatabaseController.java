package kr.co.gardener.admin.controller.object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.model.object.CompanyA;
import kr.co.gardener.admin.service.object.DatabaseService;

@Controller
@RequestMapping("/admin/object/database/")
public class DatabaseController {
	final String path = "admin/object/database/";

	@Autowired
	DatabaseService service;

	@RequestMapping({ "/", "/list" })
	public String list(Model model) {
		String str = service.list();
		List<Company> list = new ArrayList<Company>();
		try {

            JsonParser jsonParser = new JsonParser();
            JsonObject jo = (JsonObject)jsonParser.parse(str);
            JsonArray jsonArr = jo.getAsJsonArray("data");
            Gson gson = new Gson(); 
            System.out.println(jsonArr.toString());
            jsonArr.forEach(data->{
            	Company com = gson.fromJson(data, Company.class);
            	list.add(com);
            });
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("list", list);
		
		return path + "database";
	}

	@RequestMapping({ "/list/{start}/{end}" })
	public String list(@PathVariable int start, @PathVariable int end) {
		return path + "database";
	}

}
