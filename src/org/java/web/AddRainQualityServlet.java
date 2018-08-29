package org.java.web;

import java.io.IOException;
import java.sql.Date;

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
@WebServlet("/addquestions")
public class AddRainQualityServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.sendRedirect("show");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Manage rainQuality = new Manage();
		rainQuality.setB_name(req.getParameter("name"));	
		rainQuality.setB_time(Date.valueOf(req.getParameter("birthday")));
		rainQuality.setB_type(Integer.parseInt(req.getParameter("xiang")));
		rainQuality.setB_author(req.getParameter("zhuozhe"));
		BookManageDaoService book = new BookManageDaoServiceimpl();
		book.addBookQualityRecords(rainQuality);
		resp.sendRedirect("show");
	}

}
