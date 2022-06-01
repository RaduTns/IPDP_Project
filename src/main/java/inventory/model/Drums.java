package inventory.model;

public class Drums implements MusicalInstruments {
	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String pieces;

	public Drums(Integer invNr, String type, String model, String price, String company, String pieces) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.pieces = pieces;
	}

	public Drums() {
		
	}
	
	@Override
	public Integer getInvNr() {
		return invNr;
	}

	public void setInvNr(Integer invNr) {
		this.invNr = invNr;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
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

}
