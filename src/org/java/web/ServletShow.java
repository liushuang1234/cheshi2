package org.java.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.java.Service.BookManageDaoService;
import org.java.Service.impl.BookManageDaoServiceimpl;
import org.java.dao.BookManageDao;
import org.java.dao.impl.BookQualityDaoImpl;
import org.java.entity.Manage;
@WebServlet("/show")
public class ServletShow extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		BookManageDaoService book = new BookManageDaoServiceimpl();
		List<Manage> list = book.getBookQuality();
		req.setAttribute("list", list);
		req.getRequestDispatcher("WEB-INF/jsp/BookQualityList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

}
