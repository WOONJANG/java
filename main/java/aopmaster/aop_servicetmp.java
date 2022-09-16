package aopmaster;

import java.sql.*;

public class aop_servicetmp implements aop_service {

	public aop_dao dao;
	
	
	@Override
	public void setdao(aop_dao dao) {
		
		this.dao = dao;
		
	}
	
	@Override
	public String insertdb(String data) throws Exception {
		
		String aaa = "insert into imgs values ('0','"+data+"')";
		return aaa;
		
	}
	@Override
	public String deletedb(String idx) throws Exception{
		
		String bbb= "delete from imgs where iidx='"+idx+"'";
		
		return bbb;
	}

	@Override
	public void register() throws Exception {
		
		dao.insertmethod();
		
	}

	@Override
	public void modify() throws Exception {

		dao.updatemethod();
		dao.deletemethod();
		
	}

}
