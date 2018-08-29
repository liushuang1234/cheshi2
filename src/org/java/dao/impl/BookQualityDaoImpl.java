package org.java.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.java.dao.BaseDao;
import org.java.dao.BookManageDao;
import org.java.entity.Manage;
public class BookQualityDaoImpl extends BaseDao implements BookManageDao {
	@Override
	public List<Manage> getBookQuality() {
		List<Manage> list = new ArrayList<Manage>();
		String sql = "SELECT * FROM bookmamage ";
		Object[] params= null;
		Rs=super.getResultSet(sql, params);
		try {
			while(Rs.next()){
				Manage rainQuality = new Manage();
				rainQuality.setB_id(Rs.getLong(1));
				rainQuality.setB_name(Rs.getString(2));
				rainQuality.setB_author(Rs.getString(3));
				rainQuality.setB_time(Rs.getDate(4));
				rainQuality.setB_type(Rs.getInt(5));
				list.add(rainQuality);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			this.getClose(Conn, Ps, Rs);
		}
		return list;
	}


	@Override
	public void BookQualityDelete(String id) {
		String sql = "DELETE FROM bookmamage WHERE b_id=?";
		Object[] params = {id};
		super.getUptate(sql, params);
		
	}

	@Override
	public void addBookQualityRecords(Manage rainQuality) {
		String sql = "INSERT INTO bookmamage(b_name,b_author,b_time,b_type) VALUES(?,?,?,?)";
		Object[] params = {rainQuality.getB_name(),rainQuality.getB_author(),rainQuality.getB_time(),rainQuality.getB_type()};
		super.getUptate(sql, params);
		
	}

}