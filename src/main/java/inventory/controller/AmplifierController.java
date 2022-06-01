package inventory.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import inventory.model.Amplifiers;
import inventory.DAO.DAOAmplifiersImplementation;
import inventory.controller.dto.AmplifiersDTO;
import inventory.controller.dto.DTOMapper;

@Stateless
public class AmplifierController {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Inject
	DAOAmplifiersImplementation DAOAmpImp;
	
	public List<AmplifiersDTO> getAll() {

		List<AmplifiersDTO> amplifiersDTO = new ArrayList<>();
		try {
			List<Amplifiers> amplifiers = DAOAmpImp.getAll();
			DTOMapper dtoMapper = new DTOMapper();
			for(Amplifiers amplifier :amplifiers) {
				LOGGER.log(Level.INFO,"getAll() working as intended");
				amplifiersDTO.add(dtoMapper.toAmplifiersDTO(amplifier));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return amplifiersDTO;
	}
	
	public AmplifiersDTO getByInventoryNumber(String inventoryNumber) {

		AmplifiersDTO amplifierDTO = new AmplifiersDTO();
		try {
			Amplifiers amplifiers = DAOAmpImp.getByInventoryNumber(inventoryNumber);
			DTOMapper dtoMapper = new DTOMapper();			
			LOGGER.log(Level.INFO,"getByInventoryNumber("+inventoryNumber+") working as intended");
			amplifierDTO=dtoMapper.toAmplifiersDTO(amplifiers);
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return amplifierDTO;
	}

	public List<AmplifiersDTO> getByTechnology(String tech) {

		List<AmplifiersDTO> amplifiersDTO = new ArrayList<>();
		try {
			List<Amplifiers> amplifiers = DAOAmpImp.getByTechnology(tech);
			DTOMapper dtoMapper = new DTOMapper();
			for(Amplifiers amplifier :amplifiers) {
				LOGGER.log(Level.INFO,"getAll() working as intended");
				amplifiersDTO.add(dtoMapper.toAmplifiersDTO(amplifier));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return amplifiersDTO;
	}
	
	public List<AmplifiersDTO> getByKnobs(String knobs) {

		List<AmplifiersDTO> amplifiersDTO = new ArrayList<>();
		try {
			List<Amplifiers> amplifiers = DAOAmpImp.getByKnobs(knobs);
			DTOMapper dtoMapper = new DTOMapper();
			for(Amplifiers amplifier :amplifiers) {
				LOGGER.log(Level.INFO,"getAll() working as intended");
				amplifiersDTO.add(dtoMapper.toAmplifiersDTO(amplifier));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return amplifiersDTO;
	}
	
	public List<AmplifiersDTO> getByCompany(String company) {

		List<AmplifiersDTO> amplifiersDTO = new ArrayList<>();
		try {
			List<Amplifiers> amplifiers = DAOAmpImp.getByCompany(company);
			DTOMapper dtoMapper = new DTOMapper();
			for(Amplifiers amplifier :amplifiers) {
				LOGGER.log(Level.INFO,"getByCompany() working as intended");
				amplifiersDTO.add(dtoMapper.toAmplifiersDTO(amplifier));
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "EROARE" + e);
		}
		return amplifiersDTO;
	}
}
