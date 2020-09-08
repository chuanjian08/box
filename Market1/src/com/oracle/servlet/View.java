package com.oracle.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.oracle.entity.Product;
import com.oracle.service.ProductService;

/**
 * Servlet implementation class View
 */
public class View extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;Charset=UTF-8");
//	String name=request.getParameter("name1");
//	String price=request.getParameter("price");
//	String address=request.getParameter("address");
//	String imagine=request.getParameter("imagine");
//	String but1=request.getParameter("but1");
//	String but2=request.getParameter("but2");
//	Product product=new Product();
//	ProductService ps=new ProductService();
//	if("确定".equals(but1)){
//		product.setName(name);
//		product.setPrice(price);
//		product.setAddress(address);
//		product.setImagine(imagine);
//		int no=0;
//		try {
//			no=ps.Add(product);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(no>0){
//			JOptionPane.showMessageDialog(null, "添加成功");
//			request.getRequestDispatcher("Mainview").forward(request, response);
//		}
//		
//	}
//	if("返回".equals(but2)){
//		request.getRequestDispatcher("Mainview").forward(request, response);
//	}
//	//删除
//		String name1=request.getParameter("delete");
//		
//		int no=0;
//			
//			product.setName(name1);
//		    try {
//				no=ps.delete(product);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//			
//		    if(no>0){
//		    	JOptionPane.showMessageDialog(null, "删除成功");
//		    	request.getRequestDispatcher("Mainview").forward(request, response);
//		    }
//		String but3=request.getParameter("but3");    
//		String but4=request.getParameter("but4");
//		if("确定".equals(but3)){
//			request.getRequestDispatcher("Mainview").forward(request, response);
//		}
//		if("返回".equals(but4)){
//			request.getRequestDispatcher("Mainview").forward(request, response);
//		}
		doPost(request,response);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
		PrintWriter out=response.getWriter();
		String txt=request.getParameter("uname");
		String btn1=request.getParameter("btn1");
		String btn2=request.getParameter("btn2");
		Product product=new Product();
		product.setName(txt);
		ProductService ps=new ProductService();
		//添加页面
		if("添加".equals(btn2)){
			out.print("<html>");
			out.print("<form action='View'>");
			out.print("<table width=300px height=300px border=1>");
			out.print("<tr>");
			out.print("<td>产品名称</td>");
			out.print("<td><input type=text name=name1></td>");
			out.print("<td>产品价格</td>");
			out.print("<td><input type=text name=price></td>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<td>产品产地</td>");
			out.print("<td colspan='3'><input type=text name=address></td>");
			out.print("</tr>");
			out.print("<tr>");
			out.print("<td>产品图片</td>");
			out.print("<td colspan='3'><input type=file name=imagine></td>");
			out.print("</tr>");
			out.print("<td><input type=submit name=but1 value='确定'></td>");
			out.print("<td><input type=submit name=but2 value='返回'></td>");
			out.print("</table>");
			out.print("</form>");
			out.print("</html>");
		}
		//查询页面
		if("查询".equals(btn1)){
			out.print("<html>");
			out.print("<form>");
			out.print("<table width=300px height=300px border=1>");
			try {
				ArrayList<Product> prod=ps.Find2(product);
				for (Product p : prod) {
					out.print("<tr>");
					out.print("<td>产品名称</td>");
					out.print("<td>"+p.getName()+"</td>");
					out.print("<td>产品价格</td>");
					out.print("<td>"+p.getPrice()+"</td>");
					out.print("</tr>");
					out.print("<tr>");
					out.print("<td>产品产地</td>");
					out.print("<td colspan='3'>"+p.getAddress()+"</td>");
					out.print("</tr>");
					out.print("<tr>");
					out.print("<td>产品图片</td>");
					out.print("<td colspan='3'><img src=img/"+p.getImagine()+"></td>");
					
					out.print("</tr>");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			out.print("</table>");
			out.print("<td><input type=submit name=but3 value='确定'></td>");
			out.print("<td><input type=submit name=but4 value='返回'></td>");
			out.print("</form>");
			out.print("</html>");
		}
	//删除
	String[] ch1=request.getParameterValues("check");
	String but=request.getParameter("btn3");
	if(ch1.length==1||ch1==null){
		if("删除".equals(but)){
		out.print("<html>");
		out.print("<form>");
		out.print("<input type=text name=delete>");
		out.print("<input type=submit value='确定'>");
		out.print("</form>");
		out.print("</html>");
	}	
}else{
	JOptionPane.showMessageDialog(null, "不能删除多行");
	response.sendRedirect("Mainview");
}
}

}
