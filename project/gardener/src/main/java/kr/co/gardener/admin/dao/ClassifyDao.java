package kr.co.gardener.admin.dao;

import java.util.List;

import kr.co.gardener.admin.model.Classify;

public interface ClassifyDao {

	List<Classify> getTopClassList();

	List<Classify> getMidClassList();

	List<Classify> getBotClassList();

}
