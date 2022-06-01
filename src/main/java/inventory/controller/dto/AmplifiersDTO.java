package inventory.controller.dto;

import javax.persistence.Column;

public class AmplifiersDTO {
	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String tech;
	private String knobs;

	public AmplifiersDTO() {
		super();
	}

	public AmplifiersDTO(Integer invNr, String type, String model, String price, String company, String tech,
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

	public Integer getInvNr() {
		return invNr;
	}

	public void setInvNr(Integer invNr) {
		this.invNr = invNr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
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

	@Override
	public String toString() {
		return "AmplifiersDTO [invNr=" + invNr + ", type=" + type + ", model=" + model + ", price=" + price
				+ ", company=" + company + ", tech=" + tech + ", knobs=" + knobs + "]";
	}

	
	
}
