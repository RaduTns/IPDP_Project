package inventory.DAO;

import java.sql.SQLException;
import java.util.List;

import inventory.model.Drums;

public interface DAODrums extends DAO<Drums> {

	List<Drums> getByPiecesNumber(String pieces) throws SQLException;
}
