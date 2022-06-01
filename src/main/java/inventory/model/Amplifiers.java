package inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "amplifiers")
public class Amplifiers implements MusicalInstruments {
	@Id
	@Column(name = "invnr")
	private Integer invNr;
	@Column(name = "type")
	private String type;
	@Column(name = "model")
	private String model;
	@Column(name = "price")
	private String price;
	@Column(name = "company")
	private String company;
	@Column(name = "tech")
	private String tech;
	@Column(name = "knobs")
	private String knobs;

	public Amplifiers(Integer invNr, String type, String model, String price, String company, String tech,
			String knobs) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.tech = tech;
		this.knobs = knobs;
	}

	public Amplifiers() {
		super();
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public String getKnobs() {
		return knobs;
	}

	public void setKnobs(String knobs) {
		this.knobs = knobs;
	}

	public void setInvNr(Integer invNr) {
		this.invNr = invNr;
	}

	@Override
	public Integer getInvNr() {
		return invNr;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getModel() {
		return model;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String getPrice() {
		return price;
	}

}
