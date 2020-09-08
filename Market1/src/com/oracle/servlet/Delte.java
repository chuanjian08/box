package com.oracle.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.oracle.entity.Product;
import com.oracle.service.ProductService;

/**
 * Servlet implementation class Delte
 */
public class Delte extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
		ProductService ps=new ProductService();
		Product product=new Product();
		//É¾³ý
		String[] ch1=request.getParameterValues("check");
		for (String x : ch1) {
			System.out.println(x);
		}
		String delt1=request.getParameter("btn3");
		System.out.println("++++++++++++++++");
		System.out.println(delt1);
		
			if(ch1!=null&&ch1.length==1){
				int no=0;
					product.setName(ch1[0]);
				    try {
						no=ps.delete(product);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				    if(no>0){
				    	JOptionPane.showMessageDialog(null, "É¾³ý³É¹¦");
				    	request.getRequestDispatcher("Mainview.jsp").forward(request, response);
				    }
			}else{
				JOptionPane.showMessageDialog(null, "É¾³ýÊ§°Ü");
				response.sendRedirect("Mainview.jsp");
			}
	}

}
