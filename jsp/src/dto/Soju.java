package dto;

import java.io.Serializable;

public class Soju implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sId;
	private String sName;
	private Integer sPrice;
	private String description;
	private String manufacturer;
	private String category;
	private long unitsInStock;
	private double per;
	
	public Soju() {
		super();
	}
	public Soju(String sId,String sName, Integer unitPrice) {
		this.sId=sId;
		this.sName=sName;
		sPrice=unitPrice;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Integer getsPrice() {
		return sPrice;
	}
	public void setsPrice(Integer sPrice) {
		this.sPrice = sPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double d) {
		this.per = d;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
