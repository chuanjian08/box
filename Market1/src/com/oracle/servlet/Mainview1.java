package com.oracle.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.oracle.entity.Product;
import com.oracle.service.ProductService;

/**
 * Servlet implementation class Mainview1
 */
public class Mainview1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//but4 ²é¿´°´Å¥
		String but1=request.getParameter("btn4");
		
			ProductService ps=new ProductService();
			try {
				ArrayList<Product> list = ps.Find1();
				HttpSession session=request.getSession();
				session.setAttribute("list",list);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Look.jsp").forward(request, response);
		
		
		
		
		
		
		
		
	
	


	}
	}	