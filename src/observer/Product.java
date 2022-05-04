package observer;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String name;
	
	public Product() {
		super();
	}

	public Product(String name, double price) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + "]";
	}
}
