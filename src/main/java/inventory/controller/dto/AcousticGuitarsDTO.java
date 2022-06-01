package inventory.controller.dto;

public class AcousticGuitarsDTO {

	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String guitarType;

	public AcousticGuitarsDTO(Integer invNr, String type, String model, String price, String company,
			String guitarType) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.guitarType = guitarType;
	}

	public AcousticGuitarsDTO() {
		super();
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

	public String getGuitarType() {
		return guitarType;
	}

	public void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}

}
