package com.oacle.DButils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DButils {
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	private static final String URL ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";

	private Connection conn =null; //创建连接
	private PreparedStatement ps =null; // 执行对象
	private ResultSet rs=null; //结果集
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//增删改
	public int executeUpdatePs(String sql, Object[] objects) throws SQLException {
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		ps = conn.prepareStatement(sql);// 1 ps 预编译sql
		if (objects != null) {
			// 设置
			for (int i = 0; i < objects.length; i++) {
				// 2  ps  设置值
				ps.setObject(i + 1, objects[i]);

			}
		}
		// ps  执行
		int no = ps.executeUpdate();
		return no;

	}
/**
 * 查
 * @param sql
 * @param objects
 * @return
 * @throws SQLException
 */
	public ResultSet executeQueryPs(String sql, Object[] objects) throws SQLException {
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		ps = conn.prepareStatement(sql);
		// ps 做什么事情？
		if (objects != null) {
			// ps 设置值

			for (int i = 0; i < objects.length; i++) {
				ps.setObject(i + 1, objects[i]);

			}
		}

		return rs = ps.executeQuery();

	}

	public void close() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

