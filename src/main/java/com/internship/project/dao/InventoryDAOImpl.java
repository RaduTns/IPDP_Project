package com.internship.project.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.faces.component.FacesComponent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.sql.PreparedStatement;
import com.internship.project.database.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import com.internship.project.model.Inventory;

@RequestScoped
//@Stateless
//@ApplicationScoped
//@Default
public class InventoryDAOImpl implements InventoryDAO {
	@PersistenceContext
	EntityManager em;
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	@Override
	public Inventory getByInvNr(String inventorynumber) throws SQLException {
		return em.find(Inventory.class, inventorynumber);
	}

	@Override
	public List<Inventory> getAll() throws SQLException {
		List<Inventory> inventories = new ArrayList<>();
		inventories = em.createQuery("Select f from inventory f").getResultList();
		LOGGER.info("--------------------All Users retrieved--------------------");
		return inventories;
	}

	public List<Inventory> filterCostCenter(String costCenter) throws SQLException {
		List<Inventory> filteredInventories = new ArrayList<>();
		filteredInventories = em.createQuery("Select f from inventory f where f.costCenter like :filteredValue")
				.setParameter("filteredValue", costCenter).getResultList();
		LOGGER.info("-------------------"+costCenter+" type retrieved--------------- ");
		return filteredInventories;
	}

	@Override
	public void save(Inventory inventory) throws SQLException {
		em.persist(inventory);
	}

	@Override
	public Inventory update(Inventory inventory) throws SQLException {
		return em.merge(inventory);

	}

	@Override
	public void delete(Inventory inventory) throws SQLException {
		em.remove(inventory);
	}

}
