package inventory.controller.dto;

public class ElectricGuitarDTO {

	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String guitarType;
	private String bodyShape;

	public ElectricGuitarDTO(Integer invNr, String type, String model, String price, String company, String guitarType,
			String bodyShape) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.guitarType = guitarType;
		this.bodyShape = bodyShape;
	}

	public ElectricGuitarDTO() {
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

	public String getBodyShape() {
		return bodyShape;
	}

	public void setBodyShape(String bodyShape) {
		this.bodyShape = bodyShape;
	}

}
