package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 

public class Store {
	
	@Autowired 
	private Item myitem;
	
	public Item getItem () {
		
		myitem.setPrice(220);
		
		return myitem;
	}

}
