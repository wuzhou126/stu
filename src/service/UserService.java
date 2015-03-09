package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.User;
import dao.Dao;

public class UserService {

	public List<User> selectAllUser() {
		SqlSession session = Dao.getSqlSession();
		List<User> list = session.selectList("SelectAllUser");
		Dao.closeSqlSession(session);
		return list;
	}

}
