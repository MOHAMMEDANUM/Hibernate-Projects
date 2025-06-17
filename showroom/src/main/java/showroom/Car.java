package showroom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String name;
	private String color;
	private int cc;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Car(int id, String brand, String name, String color, int cc) {
		super();
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.cc = cc;
	}
	public Car() {
		super();
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", name=" + name + ", color=" + color + ", cc=" + cc + "]";
	}
	
}
