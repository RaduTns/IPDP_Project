package inventory.DAO;

import java.util.List;

import inventory.model.AcousticGuitars;
import inventory.model.Guitars;

public interface DAOGuitarsAcoustic extends DAO<AcousticGuitars> {

	List<AcousticGuitars> getByGuitarType(String guitarType);
}
