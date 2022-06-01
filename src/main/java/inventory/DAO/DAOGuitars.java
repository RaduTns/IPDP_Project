package inventory.DAO;

import java.sql.SQLException;
import java.util.List;

import inventory.model.Guitars;

public interface DAOGuitars extends DAO<Guitars> {

	List<Guitars> getByGuitarType(String type) throws SQLException;
}
