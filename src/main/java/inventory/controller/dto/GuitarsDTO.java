package inventory.controller.dto;

import inventory.model.GuitarType;

public class GuitarsDTO {
	private String invNr;
	private String type;
	private String model;
	private String price;
	private String company;
	private GuitarType guitarType;
	private String stringsNumber;
	
	public String getInvNr() {
		return invNr;
	}
	public String getType() {
		return type;
	}
	public String getModel() {
		return model;
	}
	public String getPrice() {
		return price;
	}
	public String getCompany() {
		return company;
	}
	public GuitarType getGuitarType() {
		return guitarType;
	}
	public String getStringsNumber() {
		return stringsNumber;
	}
	
	public static class GuitarBuilder{

		private String type;
		private String model;
		private String price;
		private String company;
		private GuitarType guitarType;
		private String stringsNumber;
		
		
	}
}
