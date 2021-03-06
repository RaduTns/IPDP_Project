package inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name = "drums")
public class Drums implements MusicalInstruments {
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
	@Column(name = "pieces")
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
