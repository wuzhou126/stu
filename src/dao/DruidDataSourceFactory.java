package dao;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.DataSourceFactory;

public class DruidDataSourceFactory implements DataSourceFactory {
	private DataSource dataSource;

	@Override
	public DataSource getDataSource() {
		return this.dataSource;
	}

	@Override
	public void setProperties(Properties pro) {
		try {
			this.dataSource = com.alibaba.druid.pool.DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
