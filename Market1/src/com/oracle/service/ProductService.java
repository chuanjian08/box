package com.oracle.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.oracle.dao.ProductDao;
import com.oracle.entity.Product;

public class ProductService {
//查询
	ProductDao pd=new ProductDao();
	public ArrayList<Product> Find1() throws SQLException {
		
		ArrayList<Product> list=pd.check();
		
	    return list;
	}	
//条件查询
		public ArrayList<Product> Find2(Product product) throws SQLException{
			ArrayList<Product> list1=pd.Find(product);
		   return list1;
		}
		//删除
		public int  delete(Product product) throws SQLException{
			system.out.println("你好啊打发 ");
			int no=pd.Delete(product);
			return no;
		}
		//增加
		public int  Add(Product product) throws SQLException{
			int no=pd.Add(product);
		return no;
		}
		//分页
		public ArrayList<Product> FindFen() throws SQLException {
			
			ArrayList<Product> list=pd.Page();
			
		    return list;
		}	
		
		

}
