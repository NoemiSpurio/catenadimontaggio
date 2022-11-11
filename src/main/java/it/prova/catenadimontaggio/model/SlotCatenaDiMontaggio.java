package it.prova.catenadimontaggio.model;

import java.util.List;

public class SlotCatenaDiMontaggio {

	private Long id;
	private String brand;
	private String country;
	private List<Automobile> automobili;

	public SlotCatenaDiMontaggio() {
		super();
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
	}

	public SlotCatenaDiMontaggio(Long id, String brand, String country, List<Automobile> automobili) {
		super();
		this.id = id;
		this.brand = brand;
		this.country = country;
		this.automobili = automobili;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Automobile> getAutomobili() {
		return automobili;
	}

	public void setAutomobili(List<Automobile> automobili) {
		this.automobili = automobili;
	}

}
