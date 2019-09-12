package com.example.demo;

import org.springframework.stereotype.Component;

//to test miss behaviour, comment the @Component annotation

 @Component

public class Item {
	
	private String name ;
	private float price;
	
	public Item () {
		name = "myProduct";
		price = 120;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	
}
