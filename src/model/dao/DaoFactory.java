package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return (SellerDao) new SellerDaoJDBC(); //We inject dependencies in the program without exposing the interface implementation
	}
	
}
