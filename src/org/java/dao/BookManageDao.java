package org.java.dao;
import java.util.List;
import org.java.entity.Manage;
public interface BookManageDao {
	/**
	 * 查询全部
	 * @return RainQuality集合
	 */
	List<Manage> getBookQuality();
	/**
	 * 删除
	 * @param menbersinfo
	 */
	void BookQualityDelete(String id);
	/**
	 * 增加
	 * @param user	添加回答
	 */
	void addBookQualityRecords(Manage rainQuality);
	
}
