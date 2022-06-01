package inventory.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import inventory.controller.*;
import inventory.controller.dto.AmplifiersDTO;
import inventory.controller.dto.DrumsDTO;
import inventory.model.MusicalInstrumentType;

@Named
@SessionScoped
public class AmplifierView implements Serializable {

	@Inject
	AmplifierController amplifierController;
	@Inject
	InstrumentsFactory instrumentsFactory;
	@Inject
	DrumsController drumsController;
	private List<AmplifiersDTO> amplifiersDTO = new ArrayList<>();
	private List<DrumsDTO> drumsDTO = new ArrayList<>();

	@PostConstruct
	public void init() {
		amplifiersDTO = amplifierController.getAll();
		drumsDTO = drumsController.getAll();

		for (AmplifiersDTO amplifier : amplifiersDTO) {
			instrumentsFactory.getInstrument(MusicalInstrumentType.valueOf(amplifier.getType()));
		}

	}
	public void delete(AmplifiersDTO amp) {
		amplifierController.delete(amp);
	}
	
	public List<AmplifiersDTO> getAmplifiersDTO() {
		return amplifiersDTO.stream().sorted(Comparator.comparing(AmplifiersDTO::getInvNr))
				.collect(Collectors.toList());
	}

	public void setAmplifiersDTO(List<AmplifiersDTO> amplifiers) {
		this.amplifiersDTO = amplifiers;
	}

	public List<DrumsDTO> getDrumsDTO() {
		return drumsDTO.stream().sorted(Comparator.comparing(DrumsDTO::getInvNr)).collect(Collectors.toList());
	}

	public void setDrumsDTO(List<DrumsDTO> drumsDTO) {
		this.drumsDTO = drumsDTO;
	}

}
