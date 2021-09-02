package kr.co.gardener.admin.service.object;

import java.util.List;

import kr.co.gardener.admin.model.object.Company;
import kr.co.gardener.admin.model.object.Product;

public interface DataManagerService {

	List<Company> list(int start, int end);

	List<Product> productList(int companyId);

}
