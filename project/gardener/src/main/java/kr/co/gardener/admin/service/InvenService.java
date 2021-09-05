package kr.co.gardener.admin.service;

import java.util.List;

import kr.co.gardener.admin.model.Inven;

public interface InvenService {

	List<Inven> list();

	void add(Inven item);

	Inven item(int invenId);

	void update(Inven item);

	void delete(int invenId);


}
