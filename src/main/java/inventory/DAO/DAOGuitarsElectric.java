package inventory.DAO;

import java.util.List;

import inventory.model.AcousticGuitars;
import inventory.model.ElectricGuitar;

public interface DAOGuitarsElectric extends DAO<ElectricGuitar> {

	List<ElectricGuitar> getByGuitarType(String guitarType);
	List<ElectricGuitar> getByBodyType(String bodyType);
 }
