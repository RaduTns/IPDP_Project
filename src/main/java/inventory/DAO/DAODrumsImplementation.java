package inventory.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import inventory.model.Drums;

public class DAODrumsImplementation implements DAODrums {

	@PersistenceContext
	EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Override
	public Drums getByInventoryNumber(String inventoryNumber) throws SQLException {
		Drums drums = new Drums();
		try {
			drums=em.find(Drums.class, inventoryNumber);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare "+e);
		}
		return drums;
	}

	@Override
	public List<Drums> getAll() throws SQLException {
		List<Drums> drums = new ArrayList<>();
		try {
			drums = em.createQuery("Select f from amplifiers f").getResultList();
			LOGGER.info("--------------------All Users retrieved--------------------");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare " + e);
		}
		return drums;
	}

	@Override
	public void save(Drums drum) throws SQLException {
		em.persist(drum);

	}

	@Override
	public void delete(Drums drum) throws SQLException {
		em.remove(drum);

	}


	@Override
	public List<Drums> getByPiecesNumber(String pieces) throws SQLException {
		List<Drums> drumsByPiecesNumber = new ArrayList<>();
		try {
		drumsByPiecesNumber = em.createQuery("Select f from drums f where f.pieces like :filteredValue")
				.setParameter("filteredValue", pieces).getResultList();
		LOGGER.info("-------------------"+pieces+" pieces type retrieved--------------- ");
		}	catch(Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare:"+e);
		}
		return drumsByPiecesNumber;
	}

	@Override
	public List<Drums> getByCompany(String company) throws SQLException {
		List<Drums> drumsByCompany = new ArrayList<>();
		try {
		drumsByCompany = em.createQuery("Select f from drums f where f.company like :filteredValue")
				.setParameter("filteredValue", company).getResultList();
		LOGGER.info("-------------------"+company+" company type retrieved--------------- ");
		}	catch(Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare:"+e);
		}
		return drumsByCompany;
	}

}
