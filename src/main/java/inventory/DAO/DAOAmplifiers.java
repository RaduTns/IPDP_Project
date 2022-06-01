package inventory.DAO;

import java.sql.SQLException;
import java.util.List;

import inventory.model.Amplifiers;

public interface DAOAmplifiers extends DAO<Amplifiers> {

	List<Amplifiers> getByTechnology(String tech) throws SQLException;
	List<Amplifiers> getByKnobs(String knobs) throws SQLException;
	
}
