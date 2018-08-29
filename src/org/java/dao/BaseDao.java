package org.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BaseDao {
	private String className="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/book";
	private String user="root";
	private String password="root";
	
	protected Connection Conn =null;//声明Connection
	protected PreparedStatement Ps=null;//声明PreparedStatement
	protected ResultSet Rs=null;//结果集
	
	/**
	 * 连接
	 * @return
	 */
	public Connection getConnection(){
		try {
			Class.forName(className);
			Conn=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Conn;
	}
	
	/**
	 * 关闭
	 * @param conn
	 * @param ps
	 * @param rs
	 */
	public void getClose(Connection Conn,PreparedStatement Ps,ResultSet Rs){
		try {
			
			if(Rs!=null){
				Rs.close();
				Rs=null;
			}
			if(Ps!=null){
				Ps.close();
				Ps=null;
			}
			if(Conn!=null){
				Conn.close();
				Conn=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 增删改
	 * @param sql
	 * @param params
	 */
	public void getUptate(String sql,Object[] params){
		Conn=this.getConnection();
		try {
			Ps=Conn.prepareStatement(sql);
			if(params!=null){
				for (int i = 0; i < params.length; i++) {
					Ps.setObject(i+1, params[i]);
				}
			}
			Ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			this.getClose(Conn, Ps, Rs);
		}
	}
	
	/**
	 * 查询
	 * @param sql
	 * @param params
	 * @return
	 */
	public ResultSet getResultSet(String sql,Object[] params){
		Conn=this.getConnection();
		try {
			Ps=Conn.prepareStatement(sql);
			if(params!=null){
				for (int i = 0; i < params.length; i++) {
					Ps.setObject(i+1, params[i]);
				}
			}
			Rs=Ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Rs;
	}

}
