package com.internship.project.dao;

import java.sql.SQLException;
import java.util.List;

import com.internship.project.model.Inventory;

public interface DAO<T> {

	T getByInvNr(String inventorynumber) throws SQLException;

	List<T> getAll() throws SQLException;

	void save(T t) throws SQLException;

	Inventory update(T t) throws SQLException;

	void delete(T t) throws SQLException;

}
