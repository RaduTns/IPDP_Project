package inventory.controller.dto;

import inventory.model.Amplifiers;
import inventory.model.Drums;

public class DTOMapper {

	public AmplifiersDTO toAmplifiersDTO(Amplifiers amplifier) {
		return new AmplifiersDTO(amplifier.getInvNr(), amplifier.getType(),
				amplifier.getModel(), amplifier.getPrice(),
				amplifier.getCompany(), amplifier.getTech(), amplifier.getKnobs());
	}
	
	public Amplifiers toAmplifiers(AmplifiersDTO amplifierDTO) {
		return new Amplifiers(amplifierDTO.getInvNr(), amplifierDTO.getType(),
				amplifierDTO.getModel(), amplifierDTO.getPrice(),
				amplifierDTO.getCompany(), amplifierDTO.getTech(), amplifierDTO.getKnobs());
	}
	
	public DrumsDTO toDrumsDTO(Drums drums) {
		return new DrumsDTO(drums.getInvNr(), drums.getType(),
				drums.getModel(), drums.getPrice(),
				drums.getCompany(), drums.getPieces());
	}
	
	public Drums toDrums(DrumsDTO drumsDTO) {
		return new Drums(drumsDTO.getInvNr(), drumsDTO.getType(),
				drumsDTO.getModel(), drumsDTO.getPrice(),
				drumsDTO.getCompany(), drumsDTO.getPieces());
	}

}
