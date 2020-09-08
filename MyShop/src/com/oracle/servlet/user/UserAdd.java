package com.oracle.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.oracle.entity.Shop_User;
import com.oracle.service.UserService;

/**
 * Servlet implementation class UserAdd
 */
@WebServlet("/manager/UserAdd")
public class UserAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//		…Ë÷√◊÷∑˚ºØ
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String udesc = request.getParameter("udesc");
		System.out.println("ΩÈ…‹"+udesc);
		Map<String, String[]> map =request.getParameterMap();
		Shop_User sh =new Shop_User();
		
		try {
			BeanUtils.populate(sh, map);
			System.out.println(sh);
			UserService us =new UserService();
			try {
				int flag=us.userAdd(sh);
				if(flag>0) {
					response.sendRedirect("/manager/UserShow");
				}else {
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
