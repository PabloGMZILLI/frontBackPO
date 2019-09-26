package br.edu.imed;

public class Product {

	private Integer id;
	private String name;
	private String type;
	private String stock;
	private String price;
	private String locale;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setStock(String stock) {
		this.stock = stock;
	}
	
	public String getStock() {
		return stock;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPrice() {
		return price;
	}
	
	public String getLocale() {
		return locale;
	}
	
	public void setLocale(String locale) {
		this.locale = locale;
	}
	
	@Override
	public String toString() {
		
		return this.locale;
	}
}
