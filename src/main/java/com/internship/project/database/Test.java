package com.internship.project.database;
import java.sql.Connection;
import java.sql.SQLException;
import javax.ejb.EJB;
import com.internship.project.dao.DAO;
import com.internship.project.dao.InventoryDAO;
import com.internship.project.dao.InventoryDAOImpl;
import com.internship.project.model.Inventory;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 
public class Test {

	

	
	
	public static void main(String[] args) throws SQLException {
		Connection con = Database.getConnection();

		if (con != null) {
			System.out.println("De folosit daca nu repar em");
		}
		
		InventoryDAOImpl inventoryDAO = new InventoryDAOImpl();
		
		Inventory inventory = inventoryDAO.getByInvNr("709209057049");

		System.out.println(inventory);
		//System.out.println(inventoryDAO.getAll());
	}

}
