package com.oracle.dao;

import java.sql.SQLException;
import java.util.List;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.oracle.entity.Shop_User;


import cn.lds.C3P0.C3P0Utils;



public class Userdao {
	

	public int userAdd(Shop_User sh) throws SQLException {
	
		String sql ="insert into shop_user values(?,?,?,?,DATE_FORMAT(?,'%Y-%m-%d'),?,?,?,?,?)";
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		return 	runner.update(sql,null,sh.getUname(),sh.getUpass(),sh.getUsex(),sh.getUbirth(),sh.getUdesc(),sh.getUemail(),sh.getUphone(),sh.getUadd(),sh.getUstatus());

	}
	public static int[]totalPage() throws SQLException{
		int arr[]= {0,1};
		
		String sql ="select count(*) from shop_user";
		QueryRunner runner = new QueryRunner(C3P0Utils.getDataSource());
		Long no= (Long) runner.query(sql, new ScalarHandler());
		arr[0]=no.intValue();
		if(no.intValue()%5!=0) {
			arr[1]=no.intValue()/5+1;
		}else {
			arr[1]=no.intValue()/5;
		}
		
		return arr;
		
	}

	public List<Shop_User> userAll(int cpage, int count) throws SQLException {
		int cp =0;
		if(cpage==1) {
			cp=0;
		}else {
			cp=(cpage-1)*5;
		}
		String sql ="select * from shop_user limit ?,?";
		QueryRunner runner =new QueryRunner(C3P0Utils.getDataSource());
	
		return runner.query( sql,new BeanListHandler<Shop_User> (Shop_User.class),cp,count);
	}

}
