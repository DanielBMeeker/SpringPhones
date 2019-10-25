package dmacc.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	@Column(name="PHONE")
	private String number;
	@Column(name="BRAND")
	private String brand;
	@Column(name="MODEL")
	private String model;
	@Column(name="CAPACITYGB")
	private int capacityGB;
	public Phone() {
		super();
	}
	public Phone(String number, String brand, String model, int capacity) {
		super();
		this.number = number;
		this.brand = brand;
		this.model = model;
		this.capacityGB = capacity;
	}
	public Phone(long id, String number, String brand, String model, int capacity) {
		super();
		this.id = id;
		this.number = number;
		this.brand = brand;
		this.model = model;
		this.capacityGB = capacity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCapacityGB() {
		return capacityGB;
	}
	public void setCapacityGB(int capacity) {
		this.capacityGB = capacity;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", number=" + number + ", brand=" + brand + ", model=" + model + ", capacity="
				+ capacityGB + "]";
	}

}
