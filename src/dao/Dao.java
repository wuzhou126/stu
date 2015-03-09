package dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Dao {

	private static String CONFIG_PATH = "configuration.xml";

	public static SqlSession getSqlSession() {
		SqlSession session = null;
		try {
			InputStream config = Resources.getResourceAsStream(CONFIG_PATH);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(config);
			session = factory.openSession();
		} catch (Exception e) {
			System.out.println("打开SqlSession失败!");
			e.printStackTrace();
		}
		return session;
	}

	public static void closeSqlSession(SqlSession session) {
		session.close();
	}
}
