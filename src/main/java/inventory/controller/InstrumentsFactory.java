package inventory.controller;

import javax.ejb.Stateless;

import inventory.model.AcousticGuitars;
import inventory.model.Amplifiers;
import inventory.model.BassGuitar;
import inventory.model.Drums;
import inventory.model.ElectricGuitar;
import inventory.model.MusicalInstrumentType;
import inventory.model.MusicalInstruments;
@Stateless
public class InstrumentsFactory {

	public MusicalInstruments getInstrument(MusicalInstrumentType type) {
		switch (type) {
		case AMPLIFIER:
			return new Amplifiers();

		case DRUMS:
			return new Drums();

		case ELECTRICGUITAR:
			return new ElectricGuitar();

		case BASSGUITAR:
			return new BassGuitar();

		case ACOUSTICGUITAR:
			return new AcousticGuitars();

		default:
			return null;
		}

	}
}