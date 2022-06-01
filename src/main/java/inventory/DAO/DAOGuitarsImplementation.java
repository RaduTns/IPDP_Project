package inventory.DAO;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import inventory.model.Amplifiers;
import inventory.model.Guitars;

public class DAOGuitarsImplementation implements DAOGuitars {

	@PersistenceContext
	EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public Guitars getByInventoryNumber(String inventoryNumber) throws SQLException {
		return em.find(Guitars.class, inventoryNumber);
	}

	@Override
	public List<Guitars> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Guitars t) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Guitars t) throws SQLException {
		// TODO Auto-generated method stub

	}


	@Override
	public List<Guitars> getByGuitarType(String type) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Guitars> getByCompany(String company) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
