package kr.co.gardener.admin.dao.object;

public interface DataManagerDao {

	String list(int start, int end);

	String productList(long companyId);

	String eProductList(long companyId);
	
	
}
