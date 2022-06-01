package inventory.controller.dto;

import inventory.model.Amplifiers;

public class DTOMapper {

	public AmplifiersDTO toDTO(Amplifiers amplifier) {
		return new AmplifiersDTO(amplifier.getInvNr(), amplifier.getType(),
				amplifier.getModel(), amplifier.getPrice(),
				amplifier.getCompany(), amplifier.getTech(), amplifier.getKnobs());
	}
	
	public Amplifiers toAmplifiers(AmplifiersDTO amplifierDTO) {
		return new Amplifiers(amplifierDTO.getInvNr(), amplifierDTO.getType(),
				amplifierDTO.getModel(), amplifierDTO.getPrice(),
				amplifierDTO.getCompany(), amplifierDTO.getTech(), amplifierDTO.getKnobs());
	}

}
