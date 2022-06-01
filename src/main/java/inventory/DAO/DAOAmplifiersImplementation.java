package inventory.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import inventory.model.Amplifiers;
import inventory.model.MusicalInstruments;

public class DAOAmplifiersImplementation implements DAOAmplifiers {

	@PersistenceContext
	EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public Amplifiers getByInventoryNumber(String inventoryNumber) throws SQLException {
		Amplifiers amp = new Amplifiers();
		try {
			amp = em.find(Amplifiers.class, inventoryNumber);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare " + e);
		}
		return amp;
	}

	@Override
	public List<Amplifiers> getAll() throws SQLException {
		List<Amplifiers> allAmplifiers = new ArrayList<>();
		try {
			allAmplifiers = em.createQuery("Select f from amplifiers f").getResultList();
			LOGGER.info("--------------------All Users retrieved--------------------");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare " + e);
		}
		return allAmplifiers;
	}

	@Override
	public void save(Amplifiers amp) throws SQLException {
		em.persist(amp);
		
	}

	@Override
	public void delete(Amplifiers amp) throws SQLException {
		em.remove(amp);

	}


	@Override
	public List<Amplifiers> getByTechnology(String tech) throws SQLException {
		List<Amplifiers> ampByTech = new ArrayList<>();
		try {
		ampByTech = em.createQuery("Select f from amplifiers f where f.tech like :filteredValue")
				.setParameter("filteredValue", tech).getResultList();
		LOGGER.info("-------------------"+tech+" technology type retrieved--------------- ");
		}	catch(Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare:"+e);
		}
		return ampByTech;
	}

	@Override
	public List<Amplifiers> getByKnobs(String knobs) throws SQLException {
		List<Amplifiers> ampByKnobs = new ArrayList<>();
		try {
		ampByKnobs = em.createQuery("Select f from amplifiers f where f.knobs like :filteredValue")
				.setParameter("filteredValue", knobs).getResultList();
		LOGGER.info("-------------------"+knobs+" technology type retrieved--------------- ");
		}	catch(Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare:"+e);
		}
		return ampByKnobs;
	}

	@Override
	public List<Amplifiers> getByCompany(String company) throws SQLException {
		List<Amplifiers> ampByCompany = new ArrayList<>();
		try {
		ampByCompany = em.createQuery("Select f from amplifiers f where f.company like :filteredValue")
				.setParameter("filteredValue", company).getResultList();
		LOGGER.info("-------------------"+company+" technology type retrieved--------------- ");
		}	catch(Exception e) {
			LOGGER.log(Level.SEVERE, "Eroare:"+e);
		}
		return ampByCompany;
	}

}
