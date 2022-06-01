package inventory.DAO;

import java.util.List;

import inventory.model.AcousticGuitars;
import inventory.model.BassGuitar;

public interface DAOGuitarsBass extends DAO<BassGuitar> {

	List<BassGuitar> getByGuitarType(String guitarType);
	List<BassGuitar> getByStringsNumber(String stringsNumber);
}
