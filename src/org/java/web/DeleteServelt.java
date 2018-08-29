package org.java.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.java.dao.BookManageDao;
import org.java.dao.impl.BookQualityDaoImpl;
@WebServlet("/delete")
public class DeleteServelt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("mid");
		BookManageDao userDao = new BookQualityDaoImpl();
		userDao.BookQualityDelete(id);
		out.write("true");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	}

}
