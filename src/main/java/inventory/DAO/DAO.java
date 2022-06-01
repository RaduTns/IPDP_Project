package inventory.DAO;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T> {

	T getByInventoryNumber(String inventoryNumber) throws SQLException;
	
	List<T> getByCompany(String company) throws SQLException;

	List<T> getAll() throws SQLException;

	void save(T t) throws SQLException;

	void delete(T t) throws SQLException;

}
