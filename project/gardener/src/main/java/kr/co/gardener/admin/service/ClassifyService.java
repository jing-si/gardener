package kr.co.gardener.admin.service;

import java.util.List;

import kr.co.gardener.admin.model.Classify;

public interface ClassifyService {

	List<Classify> getTopClassList();

	List<Classify> getMidClassList();

	List<Classify> getBotClassList();

}
