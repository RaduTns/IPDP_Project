package inventory;

import java.sql.SQLException;

import inventory.DAO.DAOAmplifiersImplementation;
import inventory.model.Amplifiers;

public class Test1 {
	public static void main(String[] args) throws SQLException {
	DAOAmplifiersImplementation amplifiersDAO = new DAOAmplifiersImplementation();
	
	Amplifiers amplifiers = amplifiersDAO.getByInventoryNumber("111");

	System.out.println(amplifiers);	
	}
}
