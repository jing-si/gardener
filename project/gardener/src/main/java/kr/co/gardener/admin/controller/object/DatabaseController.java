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
import kr.co.gardener.admin.service.object.DatabaseService;

@Controller
@RequestMapping("/admin/object/database/")
public class DatabaseController {
	final String path = "admin/object/database/";
	
	@Autowired
	DatabaseService service;
	
	@RequestMapping({"/","/list"})
	public String list(Model model) {
		String list =  service.list();
//		model.addAttribute("list", list);
		try {

            JsonParser jsonParser = new JsonParser();
            JsonObject jo = (JsonObject)jsonParser.parse(list);
            JsonArray jsonArr = jo.getAsJsonArray("data");
            //jsonArr.
            Gson googleJson = new Gson();
            ArrayList<?> jsonObjList = googleJson.fromJson(jsonArr, ArrayList.class);
            System.out.println("List size is : "+jsonObjList.size());
                    System.out.println("List Elements are  : "+jsonObjList.toString());


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
		
		
//		Company[] array = gson.fromJson(list, Company[].class); 
//		List<Company> listA = Arrays.asList(array);
//		
//		model.addAttribute("listA", listA);
		return path + "database";
	}
	
	@RequestMapping({"/list/{start}/{end}"})
	public String list(@PathVariable int start, @PathVariable int end ) {
		return path + "database";
	}
	
}
