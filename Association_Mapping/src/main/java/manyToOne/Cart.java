package manyToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cart(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Cart() {
		super();
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
