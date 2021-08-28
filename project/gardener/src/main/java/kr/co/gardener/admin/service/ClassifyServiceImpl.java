package kr.co.gardener.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.gardener.admin.dao.ClassifyDao;
import kr.co.gardener.admin.model.Classify;

@Service
public class ClassifyServiceImpl implements ClassifyService {

	@Autowired
	ClassifyDao classifyDao;
	@Override
	public List<Classify> getTopClassList() {
		return classifyDao.getTopClassList();
	}

	@Override
	public List<Classify> getMidClassList() {
		return classifyDao.getMidClassList();
	}

	@Override
	public List<Classify> getBotClassList() {
		return classifyDao.getBotClassList();
	}

}
