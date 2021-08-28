package kr.co.gardener.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.gardener.admin.model.Classify;

@Repository
public class ClassifyDaoImpl implements ClassifyDao {

	@Autowired
	private SqlSession sql;

	@Override
	public List<Classify> getTopClassList() {
		return sql.selectList("classify.topClass");
	}

	@Override
	public List<Classify> getMidClassList() {
		return sql.selectList("classify.midClass");
	}

	@Override
	public List<Classify> getBotClassList() {
		return sql.selectList("classify.botClass");
	}

}
