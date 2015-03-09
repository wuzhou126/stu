package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import pojo.Persion;
import dao.Dao;

public class PersionService {

	public List<Persion> selectAllPersion() {
		SqlSession session = Dao.getSqlSession();
		List<Persion> list = session.selectList("SelectAllPersion");
		Dao.closeSqlSession(session);
		return list;
	}

}
