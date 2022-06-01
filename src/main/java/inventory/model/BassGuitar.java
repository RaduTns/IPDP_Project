package inventory.model;

public class BassGuitar implements Guitars {
	private Integer invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private GuitarType guitarType;
	private String stringsNumber;

	public BassGuitar(Integer invNr, String type, String model, String price, String company, GuitarType guitarType,
			String stringsNumber) {
		super();
		this.invNr = invNr;
		this.type = type;
		this.model = model;
		this.price = price;
		this.company = company;
		this.guitarType = guitarType;
		this.stringsNumber = stringsNumber;
	}

	public BassGuitar() {
		super();
	}

	public GuitarType getGuitarType() {
		return guitarType;
	}


	public String getStringsNumber() {
		return stringsNumber;
	}





	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public String getPrice() {
		return price;
	}

	@Override
	public String getCompany() {
		return company;
	}

	@Override
	public Integer getInvNr() {
		// TODO Auto-generated method stub
		return null;
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
