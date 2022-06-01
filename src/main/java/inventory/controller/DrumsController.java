package inventory.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;

import inventory.DAO.DAODrumsImplementation;
import inventory.controller.dto.DrumsDTO;
import inventory.controller.dto.DrumsDTO;
import inventory.controller.dto.AmplifiersDTO;
import inventory.controller.dto.DTOMapper;
import inventory.model.Amplifiers;
import inventory.model.Drums;
import inventory.model.Drums;

@Stateless
public class DrumsController {
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Inject
	DAODrumsImplementation DAODrumsImp;
	
	public List<DrumsDTO> getAll() {

		List<DrumsDTO> drumsDTO = new ArrayList<>();
		try {
			List<Drums> drums = DAODrumsImp.getAll();
			LOGGER.log(Level.INFO,"getAll() working as intended");
			DTOMapper dtoMapper = new DTOMapper();
			for(Drums drum :drums) {
				drumsDTO.add(dtoMapper.toDrumsDTO(drum));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return drumsDTO;
	}
	
	public DrumsDTO getByInventoryNumber(String inventoryNumber) {

		DrumsDTO drumsDTO = new DrumsDTO();
		try {
			Drums drums = DAODrumsImp.getByInventoryNumber(inventoryNumber);
			DTOMapper dtoMapper = new DTOMapper();			
			LOGGER.log(Level.INFO,"getByInventoryNumber("+inventoryNumber+") working as intended");
			drumsDTO=dtoMapper.toDrumsDTO(drums);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return drumsDTO;
	}
	
	public List<DrumsDTO> getByCompany(String company) {

		List<DrumsDTO> drumsDTO = new ArrayList<>();
		try {
			List<Drums> drums = DAODrumsImp.getByCompany(company);
			DTOMapper dtoMapper = new DTOMapper();
			for(Drums drum :drums) {
				LOGGER.log(Level.INFO,"getAll() working as intended");
				drumsDTO.add(dtoMapper.toDrumsDTO(drum));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return drumsDTO;
	}
	
	public List<DrumsDTO> getByPieces(String pieces) {

		List<DrumsDTO> drumsDTO = new ArrayList<>();
		try {
			List<Drums> drums = DAODrumsImp.getByPieces(pieces);
			DTOMapper dtoMapper = new DTOMapper();
			for(Drums drum :drums) {
				LOGGER.log(Level.INFO,"getAll() working as intended");
				drumsDTO.add(dtoMapper.toDrumsDTO(drum));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return drumsDTO;
	}
}
