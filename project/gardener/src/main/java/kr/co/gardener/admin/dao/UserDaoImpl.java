package kr.co.gardener.admin.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.gardener.admin.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SqlSession sql;
	
	@Override
	public List<User> list() {
		return sql.selectList("user.list");
	}

	@Override
	public void add(User item) {
		
	}

	@Override
	public User item(String userId) {
		return null;
	}

	@Override
	public void update(User item) {
		
	}

	@Override
	public void delete(String userId) {
		
	}

}
