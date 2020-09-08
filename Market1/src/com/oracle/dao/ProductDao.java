package com.oracle.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.oacle.DButils.DButils;
import com.oracle.entity.Product;
import com.oracle.entity.User;

public class ProductDao {
Product product=null;
DButils db=new DButils();	
ArrayList<Product> list=new ArrayList<Product>();
ArrayList<Product> list1=new ArrayList<Product>();
ArrayList<Product> list2=new ArrayList<Product>();
//条件查询
public ArrayList<Product> Find(Product product) throws SQLException{
	String sql = "select * from product where name = ?";
	ResultSet ps = db.executeQueryPs(sql, new Object[]{product.getName()});
	while(ps.next()){
		product=new Product();
		product.setName(ps.getString(1));
		product.setAddress(ps.getString(2));
		product.setPrice(ps.getString(3));
		product.setImagine(ps.getString(4));
		list1.add(product);
	}
	return list1;
		
}

//查询
	public ArrayList<Product> check() throws SQLException {
		String sql = "select *  from product ";
		ResultSet ps = db.executeQueryPs(sql, null);
		while(ps.next()){
			product=new Product();
			product.setName(ps.getString(1));
			product.setAddress(ps.getString(2));
			product.setPrice(ps.getString(3));
		list.add(product);
		}
		return list;
	}

//增加
	public int  Add(Product product) throws SQLException{
		//增加用户信息到数据库
		String sql="insert into product values(?,?,?,?)";
		int no=db.executeUpdatePs(sql, new Object[]{product.getName(),product.getAddress(),product.getPrice(),product.getImagine()});
	return no;
	}
	
	//删除
		public int Delete(Product product) throws SQLException{
		String sql2="delete from product where name=? ";
		int no=db.executeUpdatePs(sql2,new Object[] {product.getName()});
				
		return no;
		}
//分页
 public ArrayList<Product> Page() throws SQLException{
	 String sql=" Select  * from (select rownum rn,name,price,address from product where rownum<=2) product   where  product.rn>=1";
	 ResultSet ps = db.executeQueryPs(sql, null);
		while(ps.next()){
			product=new Product();
			product.setName(ps.getString(1));
			product.setAddress(ps.getString(2));
			product.setPrice(ps.getString(3));

		list.add(product);
		}
		return list;
 } 
//分页查询
 /**
 分页查询所有用户信息,page为要显示的第几页，row为每页有几行
 * @throws SQLException 
 */
 public ArrayList<Product> findAllUser(int page,int row) throws SQLException {
	
 /**
 下面是实现分页的SQL语句
 */
 String sql = "select * from (select a.*,rownum rn from (select * from product where status=1) a) where  "+row+"*"+page+" >= rn and ("+page+"-1)*"+row+" < rn";
 
 ResultSet ps = db.executeQueryPs(sql, new Object[]{page,row});
 			while (ps.next()) {
 				product=new Product();
 				product.setName(ps.getString(1));
 				product.setAddress(ps.getString(2));
 				product.setPrice(ps.getString(3));
 			}
  
 		return list2;
 	}
 
 
 
 
 
	 
	  
}	 
	 
