package cn.xmg_wolfcode.mybatis.util;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class MyBatisUtil {
	private static SqlSessionFactory fa;
	
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			fa = new SqlSessionFactoryBuilder().build(is);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static SqlSession getSession() {
		return fa.openSession();
	}
}
