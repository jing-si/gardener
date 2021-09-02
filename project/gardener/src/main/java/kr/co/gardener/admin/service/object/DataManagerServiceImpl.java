package kr.co.gardener.admin.service.object;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import kr.co.gardener.admin.dao.object.DataManagerDao;
import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.model.object.Product;

@Service
public class DataManagerServiceImpl implements DataManagerService {

	@Autowired
	DataManagerDao dao;

	

	@Override
	public List<Company> list(int start, int end) {
		String str = dao.list(start, end);
		List<Company> list = new ArrayList<Company>();
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				try {

					JsonParser jsonParser = new JsonParser();
					JsonObject jo = (JsonObject) jsonParser.parse(str);
					JsonArray jsonArr = jo.getAsJsonArray("data");
					Gson gson = new Gson();
					jsonArr.forEach(data -> {
						Company com = gson.fromJson(data, Company.class);
						list.add(com);
					});
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		th.run();

		return list;
	}



	@Override
	public List<Product> productList(int companyId) {
		String str = dao.productList(companyId);
		List<Product> list = new ArrayList<>();
		Thread th = new Thread(new Runnable() {
			@Override
			public void run() {
				try {

					JsonParser jsonParser = new JsonParser();
					JsonObject jo = (JsonObject) jsonParser.parse(str);
					JsonArray jsonArr = jo.getAsJsonArray("data");
					Gson gson = new Gson();
					jsonArr.forEach(data -> {
						Product com = gson.fromJson(data, Product.class);
						list.add(com);
					});
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});
		th.run();

		return list;		
	}

}
