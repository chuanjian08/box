package com.oracle.service;

import java.sql.SQLException;
import java.util.List;

import com.oracle.dao.Userdao;
import com.oracle.entity.Shop_User;

public class UserService implements com.oracle.interf.UserService{
	Userdao us =new Userdao();
	@Override
	public int userAdd(Shop_User sh) throws SQLException {
		system.out.println("你很牛啊");
		
		return us.userAdd(sh);
		
		
	}
	@Override
	public List<Shop_User> Userall(int cpage, int count) throws SQLException {
		
		
		return us.userAll(cpage,count);
		
		
	}
	@Override
	public Shop_User login(Shop_User us) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void register(Shop_User us) {
		// TODO Auto-generated method stub
		
	}
	
	
}
