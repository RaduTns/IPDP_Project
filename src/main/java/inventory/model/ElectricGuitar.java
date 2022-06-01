package inventory.model;

public class ElectricGuitar implements Guitars {

	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private String guitarType;
	private String bodyShape;

	public ElectricGuitar(Integer invNr, String type, String model, String price, String company, String guitarType,
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

	public ElectricGuitar() {
		super();
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

	public void setInvNr(Integer invNr) {
		this.invNr = invNr;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public Integer getInvNr() {
		// TODO Auto-generated method stub
		return invNr;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

	@Override
	public void setGuitarType(GuitarType guitarType) {
		// TODO Auto-generated method stub
		
	}

	/*
	 * @Override public void getStrings() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

	

}
