package inventory.controller.dto;

public class DrumsDTO {

	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String pieces;
	public DrumsDTO(Integer invNr, String type, String model, String price, String company, String pieces) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.pieces = pieces;
	}
	public DrumsDTO() {
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
	public String getPieces() {
		return pieces;
	}
	public void setPieces(String pieces) {
		this.pieces = pieces;
	}
	@Override
	public String toString() {
		return "DrumsDTO [invNr=" + invNr + ", type=" + type + ", model=" + model + ", price=" + price + ", company="
				+ company + ", pieces=" + pieces + "]";
	}
	
	
}
