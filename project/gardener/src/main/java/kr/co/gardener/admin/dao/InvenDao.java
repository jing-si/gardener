package kr.co.gardener.admin.dao;

import java.util.List;

import kr.co.gardener.admin.model.Inven;

public interface InvenDao {

	List<Inven> list();

	void add(Inven item);

	Inven item(int invenId);

	void update(Inven item);

	void delete(int invenId);

}
