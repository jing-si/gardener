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
		List<Company> list = paser(str,Company.class);
		return list;
	}



	@Override
	public List<Product> productList(long companyId) {
		String str = dao.productList(companyId);
		List<Product> list = paser(str,Product.class);	
		return list;		
	}

	private <T> List<T> paser(String str,Class<T> classType){
		List<T> list = new ArrayList<>();
		Thread th = new Thread(new Runnable() {		
			@Override
			public void run() {
				try {

					JsonParser jsonParser = new JsonParser();
					JsonObject jo = (JsonObject) jsonParser.parse(str);
					JsonArray jsonArr = jo.getAsJsonArray("data");
					Gson gson = new Gson();
					jsonArr.forEach(data -> {						
						T item = gson.fromJson(data,classType);
						list.add(item);
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
	public List<Product> eProductList(long companyId) {
		String str = dao.eProductList(companyId);
		List<Product> list = paser(str,Product.class);	
		return list;
	}



	@Override
	public List<Product> productList(int start, int end) {
		String str = dao.productList(start, end);
		List<Product> list = paser(str,Product.class);
		return list;
		
	}

}
