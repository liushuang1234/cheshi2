package org.java.Service.impl;

import java.util.List;

import org.java.Service.BookManageDaoService;
import org.java.dao.BaseDao;
import org.java.dao.BookManageDao;
import org.java.dao.impl.BookQualityDaoImpl;
import org.java.entity.Manage;

public class BookManageDaoServiceimpl extends BaseDao implements
		BookManageDaoService {
	BookManageDao book = new BookQualityDaoImpl();
	@Override
	public List<Manage> getBookQuality() {
		// TODO Auto-generated method stub
		return book.getBookQuality();
	}

	@Override
	public void BookQualityDelete(String id) {
		// TODO Auto-generated method stub
		book.BookQualityDelete(id);
	}

	@Override
	public void addBookQualityRecords(Manage rainQuality) {
		book.addBookQualityRecords(rainQuality);
		
	}
	

}
