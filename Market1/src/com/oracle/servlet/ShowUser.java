package com.oracle.servlet;

import java.io.IOException;
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
import com.oracle.entity.User;
import com.oracle.service.ProductService;
import com.oracle.service.UserService;

/**
 * Servlet implementation class ShowUser
 */
public class ShowUser extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;Charset=UTF-8");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String btn1=request.getParameter("but1");
		String btn2=request.getParameter("but2");
		//验证码
//		int num=(int) (Math.random()*4+1)*10000;
//		String num1=String.valueOf(num);
//		Cookie cookie=new Cookie("number",num1);
//		response.addCookie(cookie);
		User user=new User();
		user.setName(username);
		user.setPassword(password);
		Cookie cookie=new Cookie("username",user.getName());
		response.addCookie(cookie);
		UserService us=new UserService();
		int no=0;
		
	if("注册".equals(btn1)){
		try {
			no=us.AddUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(no>0){
			JOptionPane.showMessageDialog(null, "注册成功");
			response.sendRedirect("Register");
		}else{
			JOptionPane.showMessageDialog(null, "注册失败，请重新注册");
			response.sendRedirect("/Register");
		}
	}
	User user1=null;
	 //获取到用户输入的验证码
    String numb=request.getParameter("numb");
    System.out.println(numb);
    HttpSession session = request.getSession();
   String na= (String) session.getAttribute("checkCode");
   System.out.println(na);
   //将用户输入的验证码与session中取出的验证码进行比较，相等的话就进行登录操作不成功则返回得到登录界面
   ProductService ps=new ProductService();
	if("登录".equals(btn2)){
		try {
			 user1=us.Find(user);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(user1!=null&&na.equalsIgnoreCase(numb)){
			JOptionPane.showMessageDialog(null, "登录成功");
			try {
				ArrayList<Product> list1 = ps.Find1();
				HttpSession session1=request.getSession();
				session1.setAttribute("list1",list1);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.getRequestDispatcher("Mainview.jsp").forward(request, response);
		}else{
			JOptionPane.showMessageDialog(null, "登录失败");
			response.sendRedirect("Register.jsp");
		}
		
		
	}
	
		
	
}
	
}
