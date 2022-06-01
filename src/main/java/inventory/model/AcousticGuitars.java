package inventory.model;

public class AcousticGuitars implements Guitars {

	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private GuitarType guitarType;

	public AcousticGuitars() {
		super();
	}

	public AcousticGuitars(Integer invNr, String type, String model, String price, String company, GuitarType guitarType) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.guitarType = guitarType;
	}




	@Override
	public Integer getInvNr() {
		// TODO Auto-generated method stub
		return invNr;
	}

	public void setInvNr(Integer invNr) {
		this.invNr = invNr;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String getCompany() {
		// TODO Auto-generated method stub
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public void setGuitarType(GuitarType guitarType) {
		this.guitarType = guitarType;
		
	}

	public GuitarType getGuitarType() {
		return guitarType;
	}

	
}
