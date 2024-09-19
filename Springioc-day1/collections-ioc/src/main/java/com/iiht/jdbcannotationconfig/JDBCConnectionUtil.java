package com.iiht.jdbcannotationconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class JDBCConnectionUtil {
	
	Logger logger = Logger.getLogger("JDBCConnectionUtil");
	
	private String jdbcUrl;
	private String username;
	private String password;
	

	public JDBCConnectionUtil(String jdbcUrl, String username, String password) {
		super();
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "JDBCConnectionUtil [jdbcUrl=" + jdbcUrl + ", username=" + username + ", password=" + password + "]";
	}
	
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcUrl,username, password);
		logger.info(con.toString());
		return con;
	}

}
