package com.oracle.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.oracle.entity.Product;
import com.oracle.service.ProductService;


public class Mainview extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService ps=new ProductService();
		doPost(request,response);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
//		PrintWriter out=response.getWriter();
//		int i=1;
//		out.print("<html>");
//		out.print("<center>");
//		out.print("<form action='View' method='post'>");
//		out.print("<table width=300px height=300px border=1>");
//		try {
//			ArrayList<Product>	list1 = ps.FindFen();
//			for (Product p : list1) {
//			out.print("<tr>");
//			out.print("<td><input type=checkbox name=check /></td>");
//			out.print("<td>"+p.getName()+"</td>");
//			out.print("<td>"+p.getAddress()+"</td>");
//			out.print("<td>"+p.getPrice()+"</td>");
//			out.print("</tr>");
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		out.print("</table>");
//		out.print("<form>");
//		out.print("</center>");
//		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
//		String username=request.getParameter("username");
//		System.out.println(username);
//		Cookie[] cook=request.getCookies();
//		   String nam="";
//		   if(cook!=null){
//			   for (Cookie c : cook) {
//				   if("username".equals(c.getName())){
//					 nam=c.getValue();
//				   }
//				  
//				}
//		   }
//		response.getWriter().write("欢迎光临"+nam);
//		PrintWriter out=response.getWriter();
//		ProductService ps=new ProductService();
//		out.print("<html>");
//		out.print("<center>");
//		out.print("<form action='View' method='post'>");
//		out.print("产品信息查询</br>");
//		out.print("产品名称<input type=text name=uname></br>");
//		out.print("<input type=submit name=btn1 value=查询>");
//		out.print("<input type=submit name=btn2 value=添加></br>");
//		out.print("<table width=300px height=300px border=1>");
//		out.print("<tr>");
//		out.print("<td><input type=checkbox name=check /></td>");
//		out.print("<td>产品名称</td>");
//		out.print("<td>产品产地</td>");
//		out.print("<td>产品价格</td>");
//		out.print("</tr>");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
    	ProductService ps=new ProductService();
	    Product product=new Product();
		String txt=request.getParameter("uname");
	String btn1=request.getParameter("btn1");
		System.out.println(btn1);
		
		String btn3=request.getParameter("btn3");    
		String btn4=request.getParameter("btn4");
		System.out.println(btn4);
	if("查询".equals(btn1)){
		try {
			product.setName(txt);
			ArrayList<Product> prod=ps.Find2(product);
			HttpSession session=request.getSession();
			session.setAttribute("prod",prod);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.getRequestDispatcher("Find.jsp").forward(request, response);
		
		
	}
	//添加
	String but1=request.getParameter("but1");
	if("确定".equals(but1)){
		String name=request.getParameter("name1");
		String price=request.getParameter("price");
		String address=request.getParameter("address");
		String imagine=request.getParameter("imagine");	
		product.setName(name);
		product.setPrice(price);
		product.setAddress(address);
		product.setImagine(imagine);
		int no=0;
		try {
			no=ps.Add(product);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(no>0){
			JOptionPane.showMessageDialog(null, "添加成功");
			request.getRequestDispatcher("Mainview.jsp").forward(request, response);
		}
		
	}

	//删除
			String[] ch1=request.getParameterValues("check");
			
			String delt1=request.getParameter("btn3");
			System.out.println("++++++++++++++++");
			System.out.println(delt1);
			if("删除".equals(delt1)){
				if(ch1!=null&&ch1.length==1){
					int no=0;
						product.setName(ch1[0]);
					    try {
							no=ps.delete(product);
						} catch (SQLException e) {
							e.printStackTrace();
						}
						
					    if(no>0){
					    	JOptionPane.showMessageDialog(null, "删除成功");
					    	request.getRequestDispatcher("Mainview.jsp").forward(request, response);
					    }
				}else{
					JOptionPane.showMessageDialog(null, "删除失败/不能删除多行");
					response.sendRedirect("Mainview.jsp");
				}
			}
				
		}
//}else{
//	
//	JOptionPane.showMessageDialog(null, "不能删除多行");
//	response.sendRedirect("Mainview.jsp");
//}
		
		
		
		
		
	
		
		    
//			for (Product p : list) {
//			out.print("<tr>");
//			out.print("<td><input type=checkbox name=check /></td>");
//			out.print("<td>"+p.getName()+"</td>");
//			out.print("<td>"+p.getAddress()+"</td>");
//			out.print("<td>"+p.getPrice()+"</td>");
//			out.print("</tr>");
			
//		out.print("</table>");
//		out.print("<form>");
//		out.print("<input type=submit name=btn3 value=删除>");
//		out.print("<input type=submit name=btn4 value=查看></br>");
//		out.print("共1页");
//		out.print("<a href='Register?i=0' >首页</a>");
//		out.print("<a href='Mainview'?i=-1>上一页</a>");
//		
//		out.print("<a href='Mainview?i=1'>下一页</a>");
//		out.print("<a href='Mainview'>尾页</a>");
//		out.print("</center>");
//		out.print("</html>");
		

	

}
