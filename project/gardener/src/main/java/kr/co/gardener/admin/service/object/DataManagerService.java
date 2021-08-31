package kr.co.gardener.admin.service.object;

import java.util.List;

import kr.co.gardener.admin.model.object.Company;

public interface DataManagerService {

	List<Company> list(int start, int end);

}
