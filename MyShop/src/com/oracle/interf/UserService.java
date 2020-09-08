package com.oracle.interf;

import java.sql.SQLException;
import java.util.List;
import com.oracle.entity.Shop_User;

public interface UserService {
/**
 * 后台添加用户信息
 * @param sh
 * @return
 * @throws SQLException
 */
public int userAdd(Shop_User sh) throws SQLException; 


/**
 * 显示所有用户信息
 * @param cpage
 * @param count
 * @return
 * @throws SQLException
 */
public List<Shop_User> Userall(int cpage, int count) throws SQLException;

/**
 * 登入
 * @param us 
 * @return
 * @throws SQLException
 */
public Shop_User login(Shop_User us) throws SQLException;	
/**
 * 
 * @param us
 */
public void register(Shop_User us);
	



}




